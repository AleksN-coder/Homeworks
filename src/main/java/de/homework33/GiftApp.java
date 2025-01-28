package de.homework33;

import java.util.Scanner;

public class GiftApp {

    private static Scanner scanner = new Scanner(System.in);
    private static GiftManager giftManager = new GiftManager();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в систему управления подарками!");
        boolean running = true;

            while (running) {
                System.out.println("\nВыберите действие:");
                System.out.println("1 - Добавить подарок");
                System.out.println("2 - Показать все подарки");
                System.out.println("3 - Фильтровать подарки по категории");
                System.out.println("4 - Обновить статус подарка");
                System.out.println("5 - Выход");

                System.out.print("Выберите действие: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> addGift();
                    case 2 -> giftManager.displayAllGifts();
                    case 3 -> filterGifts();
                    case 4 -> updateGiftStatus();
                    case 5 -> {
                        running = false;
                        System.out.println("Выход из программы. Спасибо за использование!");
                    }
                    default -> System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        }

        private static void addGift() {
            System.out.print("Введите название подарка: ");
            String name = scanner.nextLine();

            System.out.print("Выберите категорию (ELECTRONICS, TOYS, BOOKS, CLOTHING, HOME_APPLIANCES): ");
            GiftCategory category = GiftCategory.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Выберите статус (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED): ");
            GiftStatus status = GiftStatus.valueOf(scanner.nextLine().toUpperCase());

            Gift gift = new Gift(name, category, status);
            giftManager.addGift(gift);
        }

        private static void filterGifts() {
            System.out.print("Введите категорию для фильтрации (ELECTRONICS, TOYS, BOOKS, CLOTHING, HOME_APPLIANCES): ");
            GiftCategory category = GiftCategory.valueOf(scanner.nextLine().toUpperCase());
            giftManager.filterByCategory(category);
        }

        private static void updateGiftStatus() {
            System.out.print("Введите название подарка, чтобы обновить его статус: ");
            String giftName = scanner.nextLine();

            System.out.print("Выберите новый статус (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED): ");
            GiftStatus newStatus = GiftStatus.valueOf(scanner.nextLine().toUpperCase());

            giftManager.updateGiftStatus(giftName, newStatus);
        }
    }



