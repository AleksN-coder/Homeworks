package de.homework31;

public class Package extends MailItem{
    double length;
    double width;
    double height;

    public Package(String sender, String recipient, double weight, double length, double width, double height) {
        super(sender, recipient, weight);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateShippingCost() {
        return weight * 2;
    }
}
