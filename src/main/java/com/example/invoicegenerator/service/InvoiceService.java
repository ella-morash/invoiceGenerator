package com.example.invoicegenerator.service;

import com.example.invoicegenerator.model.Invoice;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    public Invoice createInvoice(Invoice invoice) {

        if (invoice == null) {
            throw new IllegalArgumentException("Invoice data must be not null");
        }

        invoice.setInvoice_number("Generated INVOICE NUMBER");
        invoice.setAmount(
                String.valueOf(
                        Integer.parseInt(invoice.getPrice()) * Integer.parseInt(invoice.getQuantity())));

        return invoice;

    }

}
