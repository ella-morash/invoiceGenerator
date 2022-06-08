package com.example.invoicegenerator.controller;

import com.example.invoicegenerator.model.Invoice;
import com.example.invoicegenerator.service.InvoiceService;

import com.example.invoicegenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/invoice")
public class InvoiceController {

    private final InvoiceService service;
    private final UserService userService;

    @Autowired
    public InvoiceController(InvoiceService service, UserService userService) {

        this.service = service;
        this.userService = userService;
    }



    @PostMapping(path = "/invoice")
    public Invoice createInvoice(@RequestBody Invoice invoice) {

        return service.createInvoice(invoice);

    }

    @GetMapping(path = "/invoice/{id}")
    public Invoice getInvoice(@PathVariable Long id) {

        return service.getInvoice(id);
    }
    @PutMapping(path = "/invoice/edit")
    public String editInvoice(@RequestBody Invoice invoice) {
        return service.editInvoice(invoice);
    }
}
