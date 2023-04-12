package com.ani.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BankAccountDto {
    private Long id;
    private String owner;
    private double balance;
}
