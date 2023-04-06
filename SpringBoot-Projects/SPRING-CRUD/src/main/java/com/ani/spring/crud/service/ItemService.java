package com.ani.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ani.spring.crud.domain.Item;

public interface ItemService {
    
    Integer create(Item item);

    List<Item> readAll();

    Integer update(Item item);

    Integer delete(Long id);
}
