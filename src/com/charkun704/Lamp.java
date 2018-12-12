package com.charkun704;

public class Lamp {
    private String lampType;
    private boolean isOn;

    public Lamp(String lampType) {
        this.lampType = lampType;
        this.isOn = false;
    }

    public void turnOn(){
        System.out.println("Lamp.turnOn()\nTurning on lamp.");
    }
}
