package com.adibahsan.SOLID.SingleResponsiblity;

import com.adibahsan.SOLID.SingleResponsiblity.solution.InvoicePersistence;
import com.adibahsan.SOLID.SingleResponsiblity.solution.InvoicePrinter;

public class SingleResponsibilityRunner {
    public static  void SingleResponsibilityRunner(){
        Book book = new Book("name", "author", 2022, 22, "isbn");
        //without Solid
        Invoice invoice = new Invoice(book, 1, 25.0, 15.0);

        System.out.println("Without Single Responsibility");
        invoice.calculateTotal();
        invoice.printInvoice();
        invoice.saveToFile("Filename");

        //With solid Responsibility

        System.out.println("With Responsibility");

        //For Printing
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();

        // Saving
        InvoicePersistence invoicePersistence = new InvoicePersistence(invoice);
        invoicePersistence.saveToFile("FileName");
        invoicePersistence.saveToDatabase();
    }

}
