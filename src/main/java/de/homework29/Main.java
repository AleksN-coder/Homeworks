package de.homework29;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("1", "Alice", "alice@example.com");
        PremiumUser premiumUser = new PremiumUser("2", "Bob", "bob@example.com", "2026");
        AdminUser admin = new AdminUser("3", "Charlie", "charlie@example.com");

        System.out.println(user1.getInfo());
        System.out.println(premiumUser.getInfo());

        admin.banUser(user1);
        System.out.println(admin.getInfo());
    }
}

