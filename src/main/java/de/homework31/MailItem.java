package de.homework31;

public abstract class MailItem {
    protected String sender;//отправитель
    protected String recipient;//получатель
    protected double weight;//вес отправления в кг

    public MailItem(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    public abstract double calculateShippingCost();//абстрактный метод для расчета стоимости доставки.

    public void printDetails()//обычный метод, который выводит информацию об отправлении, включая отправителя, получателя и вес.
    {
        System.out.println("Sender" + sender + "," + "Recipient" + recipient + "," + "Weight" + weight);
    }

}
