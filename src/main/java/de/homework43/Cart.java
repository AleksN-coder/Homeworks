package de.homework43;

import java.util.ArrayList;
import java.util.List;

public class Cart<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public T removeProduct(String name) {
        for (T product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
            System.out.println("Product removed from store:" + product.getName());
        }
        return null;
    }

    public double getTotalPrice() {
        double result = 0;
        for (T product : products) {
            result += product.getPrice();
        }
        return result;
    }
    public void getInfoProducts() {
        System.out.println("Displaying all products on the monitor:");
        for (T product : products) {
            System.out.println(product.getDescription());
        }

    }

}