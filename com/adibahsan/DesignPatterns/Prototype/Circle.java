package com.adibahsan.DesignPatterns.Prototype;

public class Circle implements Component{

    int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public Circle(){
    }

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

    @Override
    public Component clone() {
        System.out.println("Duplicating Circle");
        Circle newCircle = new Circle();
        newCircle.setRadius(this.radius);
        return  newCircle;
    }
}
