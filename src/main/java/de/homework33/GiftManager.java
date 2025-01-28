package de.homework33;

import java.util.ArrayList;
import java.util.List;

public class GiftManager {
    ArrayList<Gift> gifts = new ArrayList<>();
    List<Gift> filteredGifts = new ArrayList<>();

    public GiftManager(List<Gift> filteredGifts) {
        this.filteredGifts = filteredGifts;
    }

    public GiftManager(ArrayList<Gift> gifts) {
        this.gifts = gifts;
    }

    public GiftManager() {

    }

    public void addGift(Gift gift) {
        gifts.add(gift);
        System.out.println("Подарок добавлен!");
    }

    public void displayAllGifts() {
        if (gifts.isEmpty()) {
            System.out.println("Список подарков пуст.");
            return;
        }

        System.out.println("Список всех подарков:");
        for (int i = 0; i < gifts.size(); i++) {
            System.out.println((i + 1) + ". " + gifts.get(i));
        }
    }

    public void filterByCategory(GiftCategory category) {
        List<Gift> filteredGifts = new ArrayList<>();
        for (Gift gift : gifts) {
            if (gift.getCategory() == category) {
                filteredGifts.add(gift);
            }
        }

        if (filteredGifts.isEmpty()) {
            System.out.println("Нет подарков в данной категории.");
            return;
        }

        System.out.println("Результаты фильтрации:");
        for (int i = 0; i < filteredGifts.size(); i++) {
            System.out.println((i + 1) + ". " + filteredGifts.get(i));
        }
    }

    public void updateGiftStatus(String giftName, GiftStatus newStatus) {
        for (Gift gift : gifts) {
            if (gift.getName().equalsIgnoreCase(giftName)) {
                gift.setStatus(newStatus);
                System.out.println("Статус подарка обновлен!");
                return;
            }
        }
        System.out.println("Подарок с таким именем не найден.");
    }
}

