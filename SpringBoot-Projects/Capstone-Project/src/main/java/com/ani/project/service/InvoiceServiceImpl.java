package com.ani.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ani.project.domain.Invoice;
import com.ani.project.dto.InvoiceDto;
import com.ani.project.repository.InvoiceRepository;
import com.ani.project.util.InvoiceMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository repository;
    private final InvoiceMapper mapper;
    
    @Override
    public Integer createNewInvoice(InvoiceDto dto) {
        repository.save(mapper.toDomain(dto));
        return 1;
    }

    @Override
    public List<InvoiceDto> getInvoices() {
        Iterable<Invoice> findAll = repository.findAll();
        List<InvoiceDto> invoices=new ArrayList<>();

        for (Invoice invoice : findAll) {
            invoices.add(mapper.toDto(invoice));
        }
        return invoices;
    }

    @Override
    public Integer updateInvoice(InvoiceDto invoice) {
        repository.save(mapper.toDomain(invoice));
        return 1;
    }

    @Override
    public Integer deleteInvoice(Long id) {
        repository.deleteById(id);
        return 1;
    }
}
