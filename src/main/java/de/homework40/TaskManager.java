package de.homework40;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskManager {
    public static void main(String[] args) {
        String fileName = "tasks.txt";

        // Создание и запись в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Купить молоко\n");
            writer.write("Позвонить другу\n");
            writer.write("Сделать домашнее задание\n");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение из файла
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            System.out.println("Список задач:");
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("- " + text);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}