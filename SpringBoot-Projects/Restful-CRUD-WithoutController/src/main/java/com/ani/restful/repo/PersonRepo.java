package com.ani.restful.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ani.restful.domain.Person;

@RepositoryRestResource(collectionResourceRel = "person" ,path = "person")
public interface PersonRepo extends CrudRepository<Person,Integer> {
    
}
