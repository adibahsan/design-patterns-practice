package com.adibahsan.SOLID.LiskovSubstitution;

public class LiskovSubstitutionRunner {

    public static void liskovSubRunner(){
        Rectangle rectangle = new Rectangle(2, 3);
        getAreaTest(rectangle);

        System.out.println("Rectangle's Area "+ rectangle.getArea());

        Rectangle square = new Square();
        square.setWidth(5);
        getAreaTest(square);

        System.out.println("Square's Area "+ square.getArea());

    }

    public static void getAreaTest(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }
}
