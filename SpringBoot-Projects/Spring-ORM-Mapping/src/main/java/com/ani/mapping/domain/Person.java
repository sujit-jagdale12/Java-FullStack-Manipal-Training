package com.ani.mapping.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    private String name;
    private LocalDate dob;

    @OneToMany(mappedBy = "person",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<ContactDetails> contactDetails;

    @OneToOne(mappedBy = "person", fetch = FetchType.LAZY) // when select fired, do not select all records from identity
    private IdentityDoc identityDoc;
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
