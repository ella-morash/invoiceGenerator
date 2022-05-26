package com.example.invoicegenerator.controller;

import com.example.invoicegenerator.model.Invoice;
import com.example.invoicegenerator.service.InvoiceService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/invoice")
public class InvoiceController {

    private final InvoiceService service;

    public InvoiceController(InvoiceService service) {
        this.service = service;
    }
    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello World";
    }
    @PostMapping(path = "/new")
    public Invoice createInvoice(@RequestBody Invoice invoice) {

        return service.createInvoice(invoice);

    }
}
