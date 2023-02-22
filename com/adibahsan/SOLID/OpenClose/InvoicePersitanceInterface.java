package com.adibahsan.SOLID.OpenClose;

import com.adibahsan.SOLID.SingleResponsiblity.Invoice;

public interface InvoicePersitanceInterface {
    public void save(Invoice invoice);
}
