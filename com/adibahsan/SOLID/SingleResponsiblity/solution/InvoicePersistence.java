package com.adibahsan.SOLID.SingleResponsiblity.solution;

import com.adibahsan.SOLID.SingleResponsiblity.Invoice;

public class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        System.out.println("Saving in File");
        // Creates a file with given name and writes the invoice
    }

    public void saveToDatabase() {
        System.out.println("Saving in DB");
        // Saves the invoice to database
    }
}
