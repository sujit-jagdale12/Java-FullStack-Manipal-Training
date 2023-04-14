package com.ani.data.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ani.data.domain.Invoice;

@Repository
public interface InvoiceRepo extends CrudRepository<Invoice,Long> {
    
    @Override
    List<Invoice> findAll();

    // find all clients whoes name is abc
    // select * from invoice where client = name
    List<Invoice> findByClient(String name);

    // find all invoices who are having amount > 780
    List<Invoice> findByAmtGreaterThan(Double amt);

    // find all invoices which are generated between 2023-04-02 to 2023-04-10
    // select * from invoice where inv_dt between 
    List<Invoice> findByDateBetween(LocalDate st, LocalDate ed);

    List<Invoice> findByDateBetweenAndAmtGreaterThan(LocalDate st, LocalDate ed, Double amt);

    List<Invoice> findTop10ByOrderByAmtDesc();

    List<Invoice> findByClientLike(String stm, Sort sort);

    List<Invoice> findByClientContainingOrderByClientDesc(String stm);

    Page<Invoice> findAll(Pageable page);
}
