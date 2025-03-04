package de.homework43;

public class Electronics extends Product{
    private String brand;

    public Electronics(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public boolean getDescription() {
System.out.println("The name of good:" + getName() + "the price is:" + getPrice() + "brand's name:" + brand);
        return false;
    }
}
