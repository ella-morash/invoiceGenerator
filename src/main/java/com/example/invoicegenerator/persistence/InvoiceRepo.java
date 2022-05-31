package com.example.invoicegenerator.persistence;

import com.example.invoicegenerator.model.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<InvoiceEntity,Long> {
}
