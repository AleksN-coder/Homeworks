package de.homework31;

public class Advertisement extends MailItem{
    int quantity;

    public Advertisement(String sender, String recipient, double weight, int quantity) {
        super(sender, recipient, weight);
        this.quantity = quantity;
    }

    @Override
    public double calculateShippingCost() {
        return  (quantity / 50) * 1.0;
    }
}
