package com.ani.project.service;

import java.util.List;

import com.ani.project.dto.InvoiceDto;


public interface InvoiceService {
    
    Integer createNewInvoice(InvoiceDto invoice);

    List<InvoiceDto> getInvoices();

    Integer updateInvoice(InvoiceDto invoice);

    Integer deleteInvoice(Long id);
}
