package de.homework43;

public class Book extends Product {
    private String author;

    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public boolean getDescription() {
        System.out.println("The name of good:" + getName() + "the price is:" + getPrice() + "author's name:" + author);
        return false;
    }
}
