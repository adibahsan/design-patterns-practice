package com.adibahsan.DesignPatterns.Prototype;

public class Circle implements Component{

    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering Circles");
    }
}
