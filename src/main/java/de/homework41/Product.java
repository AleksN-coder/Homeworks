package de.homework41;

import java.io.Serial;
import java.io.Serializable;

public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String name; //— название
    double price; //— цена
    int quantity ;//— количество на складе
    transient String promoCode; //— промо-код

    public Product(String name, double price, int quantity, String promoCode) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.promoCode = promoCode;
    }
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("Недостаточно товара на складе!");
        }
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", promoCode='" + promoCode + '\'' +
                '}';
    }
}
