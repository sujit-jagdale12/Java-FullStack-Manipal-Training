package com.ani.mapping.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Person_ORM")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    private String name;
    private LocalDate dob;

}
/*
      create table identity_doc (
       doc_id bigint not null,
        is_active bit,
        type varchar(255),
        person_id bigint,
        primary key (doc_id)
    ) engine=InnoDB
Hibernate:

    create table person_orm (
       person_id bigint not null,
        dob date,
        name varchar(255),
        primary key (person_id)
    ) engine=InnoDB
Hibernate:

    alter table identity_doc
       add constraint FK1sybmde7nwopn3eltirqgpfyb
       foreign key (person_id)
       references person_orm (person_id)
 */
