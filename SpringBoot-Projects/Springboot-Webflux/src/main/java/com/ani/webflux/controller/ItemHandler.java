package com.ani.webflux.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.ani.webflux.domain.Item;
import com.ani.webflux.dto.AppRes;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

@Component
public class ItemHandler {
    
    private final Map<Long,Item> items=new HashMap<>();

    public Mono<ServerResponse> create(ServerRequest request){
        Mono<Item> itemMono= request.bodyToMono(Item.class);
        return itemMono.flatMap( item -> { // Mono<Serverreponse>>

            items.put(item.getId(), item);

            return ServerResponse.status(HttpStatus.CREATED)
                    .body(
                        Mono.just(new AppRes("success", "item created")), 
                        AppRes.class
                    );
        });
    }

    public Mono<ServerResponse> read(ServerRequest request){
        Flux<Item> itemFlux=Flux.fromIterable(items.values());
        return ServerResponse.status(HttpStatus.OK).body(itemFlux,Item.class);
    }
    
    public Mono<ServerResponse> update(ServerRequest request){
        Mono<Item> itemMono=request.bodyToMono(Item.class);

        return itemMono.flatMap(newItem->{
            Item exItem=items.get(newItem.getId());
            if(exItem==null){
                return ServerResponse.status(HttpStatus.NOT_FOUND)
                .body(
                    new AppRes("fail", "Item Not Found"), 
                    AppRes.class
                );
            }
            exItem.setName(newItem.getName());
            exItem.setBrand(newItem.getBrand());
            exItem.setPrice(newItem.getPrice());
           
            items.put(newItem.getId(), exItem);

            return ServerResponse.status(HttpStatus.ACCEPTED)
                                .body(
                                    new AppRes("success", "Item updated successfully"), 
                                    AppRes.class
                                );
        });
    }

    public Mono<ServerResponse> delete(ServerRequest request){
        Long id=Long.valueOf(request.pathVariable("id"));
        items.remove(id);

        return ServerResponse.status(HttpStatus.OK)
                                .body(
                                    new AppRes("success", "Item deleted successfully"), 
                                    AppRes.class
                                );
    }
}
