package com.company.alexandra.composition;

public class Room {

    private String name;
    private Dimensions dimensions;
    private Walls walls;
    private Windows windows;
    private Lights lights;

    public Room(String name, Dimensions dimensions, Walls walls, Windows windows, Lights lights) {
        this.name = name;
        this.dimensions = dimensions;
        this.walls = walls;
        this.windows = windows;
        this.lights = lights;
    }

    public void turnOnHeat(){
        System.out.println("Heat turned on");
    }
    public void powerOn(){
        lights.turnOnLights(3);
        turnOnHeat();
    }
}
