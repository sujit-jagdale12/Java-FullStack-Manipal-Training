package com.ani.project.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.project.domain.Invoice;
import com.ani.project.dto.AppResponse;
import com.ani.project.dto.InvoiceDto;
import com.ani.project.service.InvoiceService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping(value = "/invoice")
@RestController
public class InvoiceController {

    private final InvoiceService service;
    
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewInvoice(@RequestBody InvoiceDto dto) {

        Integer sts = service.createNewInvoice(dto);

        AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Invoice Created Successfully")
                                                    .bd(sts)
                                                    .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping(value = "/", produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<InvoiceDto>>> readInvoices() {

         List<InvoiceDto> invoices = service.getInvoices();

        AppResponse<List<InvoiceDto>> response = AppResponse.<List<InvoiceDto>>builder()
                                                    .sts("success")
                                                    .msg("All Invoices")
                                                    .bd(invoices)
                                                    .build();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    @PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> updateInvoice(@RequestBody InvoiceDto dto) {

        Integer sts = service.updateInvoice(dto);

        AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Invoice updated Successfully")
                                                    .bd(sts)
                                                    .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<AppResponse<Integer>> deleteInvoice(@PathVariable Long id) {

        Integer sts = service.deleteInvoice(id);

        AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Invoice deleted Successfully")
                                                    .bd(sts)
                                                    .build();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}