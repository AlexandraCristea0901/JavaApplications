/*
This program demonstrates the OOP inheritance concept and implements
an application to order and customize different types of burgers.
There is the superclass BaseHamburger with two subclasses, HealthyHamburger and DeluxeHamburger.
 */

package com.company.alexandra.OOPChallenge;

public class Main {

    public static void main(String[] args) {
        BaseHamburger hamburger = new BaseHamburger("Base hamburger", "white bread", "pork", 3.50);
        double hamburgerPrice = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("salad", 0.75);
        hamburger.addHamburgerAddition2("onion", 0.35);
        hamburger.addHamburgerAddition3("cucumber", 0.40);
        System.out.println("Total price of the hamburger is " + hamburger.itemizeHamburger());

        HealthyHamburger healthyHamburger = new HealthyHamburger("Chicken", 3.57);
        healthyHamburger.itemizeHamburger();
        healthyHamburger.addHealthyAddition1("onion", 0.50);
        healthyHamburger.addHamburgerAddition1("tomato", 0.90);
        System.out.println("The price for a healthy hamburger is " + healthyHamburger.itemizeHamburger());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.itemizeHamburger();
        deluxeHamburger.addHamburgerAddition1("onion", 2.50);

        System.out.println("The price for a deluxe burger is " + deluxeHamburger.itemizeHamburger());


    }
}
