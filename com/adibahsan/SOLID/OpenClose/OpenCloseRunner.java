package com.adibahsan.SOLID.OpenClose;

import com.adibahsan.SOLID.SingleResponsiblity.Book;
import com.adibahsan.SOLID.SingleResponsiblity.Invoice;
import com.adibahsan.SOLID.SingleResponsiblity.solution.InvoicePersistence;
import com.adibahsan.SOLID.SingleResponsiblity.solution.InvoicePrinter;

public class OpenCloseRunner {
    public static void openCloseRunner(){
        Book book = new Book("name", "author", 2022, 22, "isbn");
        Invoice invoice = new Invoice(book, 1, 25.0, 15.0);

        //without open/Close
        System.out.println("Without Open/close");
        InvoicePersistence invoicePersistence = new InvoicePersistence(invoice);
        invoicePersistence.saveToDatabase();
        invoicePersistence.saveToFile("FileName");

        //with open/close

        InvoiceFileSaver invoiceFileSaver = new InvoiceFileSaver();
        InvoiceDBSaver invoiceDBSaver = new InvoiceDBSaver();
        invoiceDBSaver.save(invoice);
        invoiceFileSaver.save(invoice);
    }
}
