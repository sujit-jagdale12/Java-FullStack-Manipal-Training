package com.ani.webflux.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ani.webflux.domain.Item;
import com.ani.webflux.dto.AppRes;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/item")
public class ItemController {
    
    private final Map<Long,Item> items=new HashMap<>();

    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<AppRes>> create(@RequestBody Item item){
        Objects.requireNonNull(item);
        items.put(item.getId(), item);

        return Mono.just(ResponseEntity.status(HttpStatus.CREATED).body(new AppRes("created", "New Item Added")));
    }

    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Item> getAllItems(){
         return Flux.fromIterable(items.values());
    }

    @PutMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<AppRes>> update(@RequestBody Item newItem){
        Objects.requireNonNull(newItem);

        return Mono.justOrEmpty(items.get(newItem.getId()))
                .map(existingItem -> {
                    existingItem.setName(newItem.getName());
                    existingItem.setBrand(newItem.getBrand());
                    existingItem.setPrice(newItem.getPrice());

                    items.put(newItem.getId(), existingItem);

                    return ResponseEntity.status(HttpStatus.ACCEPTED)
                            .body(new AppRes("updated", "Item updated"));
                })
                .defaultIfEmpty(
                        ResponseEntity.status(HttpStatus.NOT_FOUND).body(new AppRes("fail", "failed to update"))
                );
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<AppRes>> delete(@PathVariable Long id) {
        items.remove(id);

        return Mono.just(ResponseEntity.status(HttpStatus.OK).body(new AppRes("deleted", "Item deleted")));
    }
}
