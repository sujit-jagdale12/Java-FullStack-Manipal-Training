package com.ani.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ani.project.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice,Long>{
    
}
