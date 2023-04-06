package com.ani.spring.crud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ani.spring.crud.domain.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item,Long>{
    
}
