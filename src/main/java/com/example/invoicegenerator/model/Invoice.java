package com.example.invoicegenerator.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 * The type Invoice.
 * TODO describe all fields and class
 *
 */

@JsonPropertyOrder({
        "full_name",
        "tax_id",
        "bank_name",
        "card_holder",
        "iban",
        "bic",
        "email",
        "invoice_number",
        "invoice_date",
        "description",
        "quantity",
        "price",
        "amount",
        "total"
})
public class Invoice {
    @JsonProperty("full_name")
    private final String fullName;
    @JsonProperty("tax_id")
    private final String taxId;
    @JsonProperty("bank_name")
    private final String bankName;
    @JsonProperty("card_holder")
    private final String cardHolder;
    @JsonProperty("iban")
    private final String iban;
    @JsonProperty("bic")
    private final String bic;
    @JsonProperty("email")
    private final String email;
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    @JsonProperty("invoice_date")
    private final String invoiceDate = String.valueOf(LocalDate.now(
            ZoneId.of("America/Montreal")));
    @JsonProperty("description")
    private final String description;
    @JsonProperty("quantity")
    private final String quantity;
    @JsonProperty("price")
    private final String price;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("total")
    private String total;


    /**
     * Instantiates a new Invoice.
     *
     * @param fullName   the full name
     * @param taxId      the tax id
     * @param bankName   the bank name
     * @param cardHolder the card holder
     * @param iban        the iban
     * @param bic         the bic
     * @param email       the email
     * @param description the description
     * @param quantity    the quantity
     * @param price       the price
     */
    public Invoice(
            @JsonProperty(value = "full_name", required = true)
            String fullName,
            @JsonProperty(value = "tax_id", required = true)
            String taxId,
            @JsonProperty(value = "bank_name", required = true)
            String bankName,
            @JsonProperty(value = "card_holder", required = true)
            String cardHolder,
            @JsonProperty(value = "iban", required = true)
            String iban,
            @JsonProperty(value = "bic", required = true)
            String bic,
            @JsonProperty(value = "email", required = true)
            String email,
            @JsonProperty(value = "description", required = true)
            String description,
            @JsonProperty(value = "quantity", required = true)
            String quantity,
            @JsonProperty(value = "price", required = true)
            String price
    ) {
        this.fullName = fullName;
        this.taxId = taxId;
        this.bankName = bankName;
        this.cardHolder = cardHolder;
        this.iban = iban;
        this.bic = bic;
        this.email = email;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }





    /**
     * Gets full name.
     *
     * @return the full name
     */
    @JsonGetter
    public String getFullName() {
        return fullName;
    }

    /**
     * Gets tax id.
     *
     * @return the tax id
     */

    @JsonGetter
    public String getTaxId() {
        return taxId;
    }

    /**
     * Gets bank name.
     *
     * @return the bank name
     */

    @JsonGetter
    public String getBankName() {
        return bankName;
    }

    /**
     * Gets card holder.
     *
     * @return the card holder
     */

    @JsonGetter
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Gets iban.
     *
     * @return the iban
     */

    @JsonGetter
    public String getIban() {
        return iban;
    }

    /**
     * Gets bic.
     *
     * @return the bic
     */

    @JsonGetter
    public String getBic() {
        return bic;
    }

    /**
     * Gets email.
     *
     * @return the email
     */

    @JsonGetter
    public String getEmail() {
        return email;
    }

    /**
     * Gets invoice number.
     *
     * @return the invoice number
     */

    @JsonGetter
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Gets invoice date.
     *
     * @return the invoice date
     */

    @JsonGetter
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Gets description.
     *
     * @return the description
     */

    @JsonGetter
    public String getDescription() {
        return description;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */

    @JsonGetter
    public String getQuantity() {
        return quantity;
    }

    /**
     * Gets price.
     *
     * @return the price
     */

    @JsonGetter
    public String getPrice() {
        return price;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */

    @JsonGetter
    public String getAmount() {
        return amount;
    }

    /**
     * Gets total.
     *
     * @return the total
     */

    @JsonGetter
    public String getTotal() {
        return total;
    }

    /**
     * Sets invoice number.
     *
     * @param invoice_number the invoice number
     */
    @JsonSetter
    public void setInvoiceNumber(String invoice_number) {
        this.invoiceNumber = invoice_number;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    @JsonSetter
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Sets total.
     *
     * @param total the total
     */
    @JsonSetter
    public void setTotal(String total) {
        this.total = total;
    }

}
