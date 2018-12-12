package com.charkun704;

public class Wall {
    private String direction;
    private int x;
    private int y;
    private String color;

    public Wall(String direction, int x, int y,String color) {
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDirection(){ return this.direction;}
    public String getColor(){ return this.color;}
}
