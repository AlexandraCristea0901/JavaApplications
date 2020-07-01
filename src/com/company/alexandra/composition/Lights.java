package com.company.alexandra.composition;

public class Lights {

    private int number;
    private String colorType;
    private int luminosityLevel;

    public Lights(int number, String colorType, int luminosityLevel) {
        this.number = number;
        this.colorType = colorType;
        this.luminosityLevel = luminosityLevel;
    }

    public void turnOnLights (int luminosity){
        if(luminosity < 5){
            System.out.println("Lights turned on");
        } else {
            System.out.println("Lights turned off");
        }
    }

    public int getNumber() {
        return number;
    }

    public String getColorType() {
        return colorType;
    }

    public int getLuminosityLevel() {
        return luminosityLevel;
    }
}
