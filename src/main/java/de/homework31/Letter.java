package de.homework31;

public  class Letter extends MailItem {

    protected boolean isRegistered;

    public Letter(String sender, String recipient, double weight, boolean isRegistered) {
        super(sender, recipient, weight);
        this.isRegistered = isRegistered;
    }

    @Override
    public double calculateShippingCost() {
        double shippingCost;
        if (isRegistered) {
            shippingCost = 10.0;
        } else {
            shippingCost = 5.0;
        }
        return shippingCost;
    }



    }


