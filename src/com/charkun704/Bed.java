package com.charkun704;

public class Bed {
    private String size;
    private boolean isMade;
    private int pillow,
                blanket;

    public Bed(String size, int pillow, int blanket) {
        this.size = size;
        this.isMade = false;
        this.pillow = pillow;
        this.blanket = blanket;
    }

    public void makeBed(){
        System.out.println("Bed.makeBed()/nMaking bed.");
        this.isMade = true;
    }
}