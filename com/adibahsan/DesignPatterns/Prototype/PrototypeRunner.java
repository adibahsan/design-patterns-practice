package com.adibahsan.DesignPatterns.Prototype;

public class PrototypeRunner {

    public static void protoTypeRunner(){
        Circle circle = new Circle(10);
        ContextMenu contextMenu = new ContextMenu();
        contextMenu.duplicate(circle);

        Square square = new Square();
        contextMenu.duplicate(square);
    }
}
