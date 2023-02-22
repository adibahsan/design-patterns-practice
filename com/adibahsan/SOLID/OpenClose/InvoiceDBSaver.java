package com.adibahsan.SOLID.OpenClose;

import com.adibahsan.SOLID.SingleResponsiblity.Invoice;

public class InvoiceDBSaver implements InvoicePersitanceInterface{
    @Override
    public void save(Invoice invoice) {
        System.out.println("Saving in the DB");
    }
}
