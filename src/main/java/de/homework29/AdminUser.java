package de.homework29;

import java.util.ArrayList;

public class AdminUser extends User {
    ArrayList<User> users = new ArrayList<>();

    public AdminUser(String id, String name, String email) {
        super(id, name, email);
        this.users = users;
    }

    public void banUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }
    @Override
    public boolean getInfo(){

        String bannedList = ""; // Строка для имён заблокированных
        for (User user : users) { // Проходим по каждому заблокированному
            bannedList += user.name + " "; // Добавляем имя к строке
        }
        bannedList = bannedList.trim(); // Убираем лишний пробел в конце

        System.out.println("User id:" + id + ", name: " + name + ", email:" + email + ", Banned List:" + bannedList );

        return false;
    }
}