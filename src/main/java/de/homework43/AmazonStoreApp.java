package de.homework43;

public class AmazonStoreApp {
    public static void main(String[] args) {
        Cart<Product> cart = new Cart<>();

        Book book = new Book("War and Peace", 1200, "Leo Tolstoy");
        Electronics electronics = new Electronics("Smartphone", 50000, "iPhone");

        cart.addProduct(book);
        cart.addProduct(electronics);

        cart.getInfoProducts();
        System.out.println("Total cost: " + cart.getTotalPrice() + "EUR");

        cart.removeProduct("War and Peace");
        cart.getInfoProducts();
        System.out.println("Total cost after removing " + cart.getTotalPrice() + "EUR");
    }
}



