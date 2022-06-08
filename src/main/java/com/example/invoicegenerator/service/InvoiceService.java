package com.example.invoicegenerator.service;

import com.example.invoicegenerator.model.Invoice;


import com.example.invoicegenerator.persistence.InvoiceRepo;
import com.example.invoicegenerator.storage.InvoiceStorageManager;
import com.example.invoicegenerator.util.InvoiceNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class InvoiceService {

    private final InvoiceRepo repo;

    private final InvoiceStorageManager storageManager;

    @Autowired
    public InvoiceService(InvoiceRepo repo, InvoiceStorageManager storageManager) {
        this.repo = repo;
        this.storageManager = storageManager;
    }

    public Invoice createInvoice(Invoice invoice) {

        if (invoice == null) {
            throw new IllegalArgumentException("Invoice data must be not null");
        }
        //generate invoice properties
        invoice.setInvoiceNumber(InvoiceNumberGenerator.generate(invoice));
        invoice.setInvoiceDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        invoice.setAmount(
                String.valueOf(
                        Integer.parseInt(invoice.getPrice()) * Integer.parseInt(invoice.getQuantity())));
        invoice.setTotal(invoice.getAmount());

        //save to repo
        repo.save(invoice);

        this.storageManager.store(invoice);

        return invoice;

    }
    public Invoice getInvoice(Long id) {

        Optional<Invoice> invoiceEntity = this.repo.findById(id);
        if (invoiceEntity.isEmpty()) {

            throw new IllegalStateException("No invoice with such id");
        }
        Invoice res = invoiceEntity.get();

        return res;
    }

    @Transactional
    public String editInvoice(Invoice invoice) {
        boolean isExist = repo.existsById(invoice.getId());
        if (!isExist) {
            new IllegalStateException("There is no such invoice.Please create first");
        }

        repo.save(invoice);

        return "";

    }
}
