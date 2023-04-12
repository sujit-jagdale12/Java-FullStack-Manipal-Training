package com.ani.rest.controller;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.rest.dto.AppResponse;
import com.ani.rest.dto.BankAccountDto;
import com.ani.rest.service.BankAccountService;

import lombok.AllArgsConstructor;

@RequestMapping(value = "/selflinks")
@RestController
@AllArgsConstructor          //Constructor injection using lambok
public class BankController {

    private final BankAccountService service;

    @GetMapping(value = "/")
    public ResponseEntity<BankAccountDto> createAccount(){
        return ResponseEntity.status(HttpStatus.OK).body(new BankAccountDto(12l, "Sujit jagdale", 103.67));
    }




    
    @GetMapping(value = "/hadeoaslinks")
    public EntityModel<AppResponse<String>> accountDetails2() {
      
        Link selfLink = linkTo(methodOn(BankController.class).createAccount())
                        .withSelfRel();

        Link withdarwLink = linkTo(methodOn(BankController.class).createAccount())
                            .withRel("withdraw");
        
        Link depositLink = linkTo(methodOn(BankController.class).createAccount())
                            .withRel("deposit");

        AppResponse<String> response = AppResponse.<String>builder()
                                        .bd("links")
                                        .sts("information")
                                        .msg("imp links")
                                        .build();

        return EntityModel.of(response, selfLink, withdarwLink, depositLink);
    }


}
