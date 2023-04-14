package com.ani.data.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Invoice {

    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "Client")
    private String client;

    @Column(name = "date")
    private LocalDate date;
    
    @Column(name = "Amount")
    private Double amt;
}
