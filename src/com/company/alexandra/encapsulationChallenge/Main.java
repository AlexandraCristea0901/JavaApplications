package com.company.alexandra.encapsulationChallenge;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(10, 0, true);
        printer.fillUpToner(80);
        printer.printPages(77, true);
        printer.fillUpToner(50);
        printer.printPages(41, false);
        System.out.println("Total number of pages printed = " + printer.getNumberOfPagesPrinted());

    }
}
