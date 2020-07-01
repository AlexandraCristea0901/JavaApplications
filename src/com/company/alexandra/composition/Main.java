/*
This program demonstrates the Composition concept, the "has a" relation between classes.
 */

package com.company.alexandra.composition;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 10);
        Walls walls = new Walls("white", "washable paint");
        Windows windows = new Windows("Zeiss", "brown", 3);
        Lights lights = new Lights(5, "warm light", 20);

        Room theRoom = new Room("Bedroom", dimensions, walls, windows, lights);
        theRoom.powerOn();


    }
}
