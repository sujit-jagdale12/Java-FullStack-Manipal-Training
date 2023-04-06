package com.ani.spring.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.spring.crud.domain.Item;
import com.ani.spring.crud.repo.ItemRepository;

@Service
public class ItemServiceMongo  implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Integer create(Item item) {
        itemRepository.save(item);
        return 0;
    }

    @Override
    public List<Item> readAll() {
       return itemRepository.findAll();
    }

    @Override
    public Integer update(Item item) {
        itemRepository.save(item);
        return 0;
    }

    @Override
    public Integer delete(Long id) {
        itemRepository.deleteById(id);
        return 0;
    }
    
}
