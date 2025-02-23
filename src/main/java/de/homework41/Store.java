package de.homework41;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();
    private static final String FILE_NAME = "products.dat";

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("Список товаров пуст.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(products);
            System.out.println("Товары сохранены в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            products = (List<Product>) objectInputStream.readObject();
            System.out.println("Товары загружены из файла.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка загрузки данных: " + e.getMessage());
        }
    }
}
