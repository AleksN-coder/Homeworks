package de.homework29;

public  class PremiumUser extends User {
    private String subscriptionEndDate;

    public PremiumUser(String id, String name, String email, String subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;
    }

    @Override
    public boolean getInfo(){
        System.out.println("User id:" + id + ", name: " + name + ", email:" + email + ", End date:" + subscriptionEndDate);
        return false;
    }

    public String getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    public boolean setSubscriptionEndDate(double subscriptionEndDate) {
        if (subscriptionEndDate <= 2026) {
            System.out.println("Subscription is active");
            return true;
        } else {
            System.out.println("Subscription is not active");
            return false;
        }
    }
}
