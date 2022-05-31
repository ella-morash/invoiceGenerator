package com.example.invoicegenerator.service;

import com.example.invoicegenerator.model.Invoice;
import com.example.invoicegenerator.persistence.InvoiceRepo;
import com.example.invoicegenerator.util.InvoiceConvertor;
import com.example.invoicegenerator.util.InvoiceNumberGenerator;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private final InvoiceRepo repo;

    public InvoiceService(InvoiceRepo repo) {
        this.repo = repo;
    }

    public Invoice createInvoice(Invoice invoice) {

        if (invoice == null) {
            throw new IllegalArgumentException("Invoice data must be not null");
        }
        //generate invoice properties
        invoice.setInvoiceNumber(InvoiceNumberGenerator.generate(invoice));
        invoice.setAmount(
                String.valueOf(
                        Integer.parseInt(invoice.getPrice()) * Integer.parseInt(invoice.getQuantity())));
        invoice.setTotal(invoice.getAmount());
       // convert invoice to entity
        //save to repo
        repo.save(InvoiceConvertor.convertToEntity(invoice));

        return invoice;

    }
    public Invoice getInvoice(Invoice invoice) {
        return null;
    }

}
