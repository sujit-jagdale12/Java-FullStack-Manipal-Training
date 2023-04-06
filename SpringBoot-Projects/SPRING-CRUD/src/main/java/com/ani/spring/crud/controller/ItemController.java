package com.ani.spring.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ani.spring.crud.domain.Item;
import com.ani.spring.crud.dto.AppRes;
import com.ani.spring.crud.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> save(@RequestBody Item item) {
        itemService.create(item);
        AppRes res = AppRes.builder().res("Add").msg("New Item Added").build();
        return ResponseEntity.status(HttpStatus.CREATED ).body(res);
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<AppRes>> read() {
        itemService.readAll();
       List<AppRes> items=new ArrayList<>();
        return ResponseEntity.status(HttpStatus.OK).body(items);
    }

   @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> update(@RequestBody Item item) {
        itemService.update(item);
        AppRes res = AppRes.builder()
                            .res("success")
                            .msg("Item Updated")
                            .build();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> delete(@PathVariable Long id) {
        itemService.delete(id);
        AppRes res = AppRes.builder().res("Delete").msg("Item Deleted").build();
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }


}
