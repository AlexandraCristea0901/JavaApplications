package com.company.alexandra.composition;

public class Windows {

    private String manufacturer;
    private String color;
    private int securityLevel;

    public Windows(String manufacturer, String color, int securityLevel) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.securityLevel = securityLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }
}
