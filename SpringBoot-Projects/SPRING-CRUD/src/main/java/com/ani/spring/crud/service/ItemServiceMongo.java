package com.ani.spring.crud.service;

import java.util.ArrayList;
import java.util.List;

import com.ani.spring.crud.domain.Item;

public class ItemServiceMongo  implements ItemService{

    @Override
    public Integer create(Item item) {
        return 0;
    }

    @Override
    public List<Item> readAll() {
        return new ArrayList<>();
    }

    @Override
    public Integer update(Item item) {
        return 0;
    }

    @Override
    public Integer delete(Long id) {
        return 0;
    }
    
}
