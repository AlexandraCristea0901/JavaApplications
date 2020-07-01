package com.company.alexandra.encapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public void fillUpToner (int tonerAddition){
        if(this.tonerLevel == 100){
            System.out.println("Toner level is 100%, no recharging needed.");
        } else if (this.tonerLevel + tonerAddition > 100) {
            System.out.println("Toner level is already " + tonerLevel + ". You can refill only with " + (100 - tonerLevel));
        } else {
            tonerLevel += tonerAddition;
            System.out.println("Toner refill completed successfully");
        }
    }

    public void printPages (int pages, boolean isDuplex){
        if(isDuplex){
            int numberOfPages = this.numberOfPagesPrinted + pages/2 + pages % 2;
            System.out.println("Total number of printed pages = " + numberOfPages);
        } else {
            this.numberOfPagesPrinted += pages;
            System.out.println("Total number of printed pages = " + this.numberOfPagesPrinted);
        }
    }
}
