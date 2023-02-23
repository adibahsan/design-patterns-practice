package com.adibahsan.DesignPatterns.Prototype;

public class Square implements Component {

    int size;

    public Square(int size) {
        this.size = size;
    }

    public Square() {
    }

    @Override
    public void render() {

    }

    @Override
    public Component clone() {
        System.out.println("Cloning Squares");
        Square square = new Square(10);
        square.size = this.size;
        return square;
    }
}
