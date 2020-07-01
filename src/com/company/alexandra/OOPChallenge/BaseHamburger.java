package com.company.alexandra.OOPChallenge;


public class BaseHamburger {

    private String name;
    private String rollType;
    private String meatType;
    private double basePrice;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public BaseHamburger(String name, String rollType, String meatType, double basePrice) {
        this.name = name;
        this.rollType = rollType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    public void addHamburgerAddition1 (String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2 (String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3 (String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4 (String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name + " hamburger with " + this.meatType + " rolled in a " + this.rollType + " costs " + this.basePrice);
        if(addition1Name != null){
            hamburgerPrice += addition1Price;
            System.out.println("Added " + addition1Name + " for " + addition1Price);
        }
        if(addition2Name != null){
            hamburgerPrice += addition2Price;
            System.out.println("Added " + addition2Name + " for " + addition2Price);
        }
        if(addition3Name != null){
            hamburgerPrice += addition3Price;
            System.out.println("Added " + addition3Name + " for " + addition3Price);
        }
        if(addition4Name != null){
            hamburgerPrice += addition4Price;
            System.out.println("Added " + addition4Name + " for " + addition4Price);
        }
        return hamburgerPrice;
    }
}


