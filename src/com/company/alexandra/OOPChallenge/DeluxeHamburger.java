package com.company.alexandra.OOPChallenge;

public class DeluxeHamburger extends BaseHamburger {

    public DeluxeHamburger() {
        super("Deluxe Hamburger", "sourdough bread", "angus meat", 13.50);
        super.addHamburgerAddition1("french fries", 3.50);
        super.addHamburgerAddition2("juice", 2.30);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Option unavailable for deluxe burger type.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Option unavailable for deluxe burger type.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Option unavailable for deluxe burger type.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Option unavailable for deluxe burger type.");
    }
}

