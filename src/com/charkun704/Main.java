package com.charkun704;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("north",20,11,"white");
        Wall wall2 = new Wall("north",20,11,"white");
        Wall wall3 = new Wall("north",20,11,"white");
        Wall wall4 = new Wall("north",20,11,"white");
        Wall cieling = new Wall("north",20,20,"white");

        Bed twin = new Bed("twin",1,1);
        Lamp floorLamp = new Lamp("floor lamp");

        Bedroom myRoom = new Bedroom("My room",wall1,wall2,wall3,wall4,cieling,twin,floorLamp);
        myRoom.makeBed();
        myRoom.getLamp().turnOn();
    }
}
