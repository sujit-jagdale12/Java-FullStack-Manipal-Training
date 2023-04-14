package com.ani.project.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class Invoice {
    
    @Id // primary key
    @Column(name = "id")
    private Long id;

    @Column(name = "client")
    private String client;

    @Column(name = "date")
    private LocalDate invDt; // inv_dt

    @Column(name = "Amount")
    private Double amt;   
}