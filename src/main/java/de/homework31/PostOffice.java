package de.homework31;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {
    List<MailItem> mailItems = new ArrayList<>();

    public PostOffice(List<MailItem> mailItems) {
        this.mailItems = mailItems;
    }
    void addMailItem(MailItem item) {
        mailItems.add(item);
    }
    void calculateTotalShippingCost(){
        double totalCost = 0;
        for (MailItem item : mailItems) {
        totalCost += item.calculateShippingCost();
    }
        System.out.println("Total shipping cost: " + totalCost + " EUR");
}

public void printAllDetails() {
    for (MailItem item : mailItems) {
        item.printDetails();
    }
}
}
