package de.homework41;

import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить товар");
            System.out.println("2. Показать товары");
            System.out.println("3. Сохранить в файл");
            System.out.println("4. Загрузить из файла");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Название: ");
                    String name = scanner.nextLine();
                    System.out.print("Цена: ");
                    double price = scanner.nextDouble();
                    System.out.print("Количество: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера
                    System.out.print("Промо-код: ");
                    String promoCode = scanner.nextLine();
                    store.addProduct(new Product(name, price, quantity, promoCode));
                    break;
                case 2:
                    store.showProducts();
                    break;
                case 3:
                    store.saveToFile();
                    break;
                case 4:
                    store.loadFromFile();
                    break;
                case 5:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Некорректный ввод!");
            }
        }
    }
    }

