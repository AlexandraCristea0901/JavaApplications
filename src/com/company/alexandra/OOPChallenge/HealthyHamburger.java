package com.company.alexandra.OOPChallenge;

public class HealthyHamburger extends BaseHamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyHamburger(String meatType, double basePrice) {
        super("Healthy Burger", "sesame bread", meatType, basePrice);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(healthyExtra1Name != null){
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for " + healthyExtra1Price);
        }
        if(healthyExtra2Name != null){
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for " + healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
