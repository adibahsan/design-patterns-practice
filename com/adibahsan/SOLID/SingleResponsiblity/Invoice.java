package com.adibahsan.SOLID.SingleResponsiblity;

public class Invoice {

     public Book book;
     public int quantity;
     public double discountRate;
     public double taxRate;
     public double total;


    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    //calculate total price
    public double calculateTotal() {
        double price = ((book.price - book.price * discountRate) * this.quantity);

        double priceWithTaxes = price * (1 + taxRate);

        return priceWithTaxes;
    }

    // print invoice
    public void printInvoice() {

        System.out.println(quantity + "x " + book.price + " " +          book.price + "$");
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total: " + total);
    }

    // save files
    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
        System.out.println("Saving Files "+ filename);
    }

}
