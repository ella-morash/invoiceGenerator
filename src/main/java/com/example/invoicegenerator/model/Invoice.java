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
    private final String full_name;
    @JsonProperty("tax_id")
    private final String tax_id;
    @JsonProperty("bank_name")
    private final String bank_name;
    @JsonProperty("card_holder")
    private final String card_holder;
    @JsonProperty("iban")
    private final String iban;
    @JsonProperty("bic")
    private final String bic;
    @JsonProperty("email")
    private final String email;
    @JsonProperty("invoice_number")
    private String invoice_number;
    @JsonProperty("invoice_date")
    private final String invoice_date = String.valueOf(LocalDate.now(
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
     * @param full_name   the full name
     * @param tax_id      the tax id
     * @param bank_name   the bank name
     * @param card_holder the card holder
     * @param iban        the iban
     * @param bic         the bic
     * @param email       the email
     * @param description the description
     * @param quantity    the quantity
     * @param price       the price
     */
    public Invoice(
            @JsonProperty(value = "full_name", required = true)
            String full_name,
            @JsonProperty(value = "tax_id", required = true)
            String tax_id,
            @JsonProperty(value = "bank_name", required = true)
            String bank_name,
            @JsonProperty(value = "card_holder", required = true)
            String card_holder,
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
        this.full_name = full_name;
        this.tax_id = tax_id;
        this.bank_name = bank_name;
        this.card_holder = card_holder;
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
    public String getFull_name() {
        return full_name;
    }

    /**
     * Gets tax id.
     *
     * @return the tax id
     */

    @JsonGetter
    public String getTax_id() {
        return tax_id;
    }

    /**
     * Gets bank name.
     *
     * @return the bank name
     */

    @JsonGetter
    public String getBank_name() {
        return bank_name;
    }

    /**
     * Gets card holder.
     *
     * @return the card holder
     */

    @JsonGetter
    public String getCard_holder() {
        return card_holder;
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
    public String getInvoice_number() {
        return invoice_number;
    }

    /**
     * Gets invoice date.
     *
     * @return the invoice date
     */

    @JsonGetter
    public String getInvoice_date() {
        return invoice_date;
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
    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
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
