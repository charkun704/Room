package com.charkun704;

public class Bedroom {
    private String name;
    private Wall wallOne;
    private Wall wallTwo;
    private Wall wallThree;
    private Wall wallFour;
    private Wall ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wallOne, Wall wallTwo, Wall wallThree, Wall wallFour,
                   Wall ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wallOne = wallOne;
        this.wallTwo = wallTwo;
        this.wallThree = wallThree;
        this.wallFour = wallFour;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){ return this.lamp; }

    public void makeBed(){
        System.out.println("Bedroom.makeBed()\nMaking bed.");
        bed.makeBed();
    }

}
