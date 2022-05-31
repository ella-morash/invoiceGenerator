package com.example.invoicegenerator.util;

import com.example.invoicegenerator.model.Invoice;
import com.example.invoicegenerator.model.InvoiceEntity;

public class InvoiceConvertor {

    public static InvoiceEntity convertToEntity(Invoice invoice) {

        InvoiceEntity invoiceEntity = new InvoiceEntity();
        invoiceEntity.setFullName(invoice.getFullName());
        invoiceEntity.setTaxId(invoice.getTaxId());
        invoiceEntity.setBankName(invoice.getBankName());
        invoiceEntity.setCardHolder(invoice.getCardHolder());
        invoiceEntity.setIban(invoice.getIban());
        invoiceEntity.setBic(invoice.getBic());
        invoiceEntity.setEmail(invoiceEntity.getEmail());
        invoiceEntity.setInvoiceDate(invoice.getInvoiceDate());
        invoiceEntity.setDescription(invoiceEntity.getDescription());
        invoiceEntity.setInvoiceDate(invoice.getQuantity());
        invoiceEntity.setPrice(invoice.getPrice());


        return invoiceEntity;
    }
}
