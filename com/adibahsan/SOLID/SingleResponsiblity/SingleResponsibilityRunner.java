package com.adibahsan.SOLID.SingleResponsiblity;

import com.adibahsan.SOLID.SingleResponsiblity.solution.InvoicePrinter;

public class SingleResponsibilityRunner {
    public static  void SingleResponsiblityRunner(){
        Book book = new Book("name", "author", 2022, 22, "isbn");
        //without Solid
        Invoice invoice = new Invoice(book, 1, 25.0, 15.0);

        System.out.println("Without Single Responsibility");
        invoice.calculateTotal();
        invoice.printInvoice();

        //With solid Responsibility

        System.out.println("With Responsibility");
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();
    }

}
