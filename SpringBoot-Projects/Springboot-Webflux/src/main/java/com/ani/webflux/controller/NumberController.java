package com.ani.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class NumberController {
    
    @GetMapping("/numbers")
    public Flux<Integer> getNumbers(){

        return Flux.range(1,100)
                //    .log()
                   .map(n->n*2)
                   .doOnNext(n->System.out.println(n))
                   .limitRate(3);
        }
}
