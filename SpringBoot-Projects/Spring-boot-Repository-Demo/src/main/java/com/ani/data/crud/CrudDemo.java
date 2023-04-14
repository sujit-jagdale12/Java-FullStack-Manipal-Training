package com.ani.data.crud;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.ani.data.domain.Invoice;
import com.ani.data.repository.InvoiceRepo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CrudDemo {
    
    private final InvoiceRepo repo;

    public void demo(){
		// CREATE
		Invoice invoice = new Invoice();
		invoice.setId(4l);
		invoice.setClient("dfsg");
		invoice.setDate(LocalDate.now());
		invoice.setAmt(567.87);

		System.out.println("🔥🔥 Add Invoice Data 🔥🔥");
		repo.save(invoice);

		// READ
		System.out.println("🔥🔥 All Invoices Data 🔥🔥");
		Iterable<Invoice> allInvoices = repo.findAll();
		allInvoices.forEach(System.out::println);

		// READBYID
		System.out.println("🔥🔥 Reading Invoice By ID 🔥🔥");
		Optional<Invoice> voice = repo.findById(2l);
		Invoice invoice2 = voice.orElseThrow(() -> new RuntimeException("✖ Id not found."));
		System.out.println(invoice2);

		//Delete
		System.out.println("🔥🔥 Deleting Invoice By ID 🔥🔥");
		repo.deleteById(4l);
		System.out.println(" 💥 3 ID Deleted ");


		//Update
		System.out.println("🔥🔥 Updating Invoice By ID 🔥🔥");
		Invoice invoice1 = new Invoice();
		invoice1.setId(3l);
		invoice1.setClient("Dayanad kale");
		invoice1.setDate(LocalDate.now());
		invoice1.setAmt(124.32);
		repo.save(invoice1);
    }
}
