package com.kotari;

public class ShapesDemo {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        System.out.println(circle);
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        System.out.println(square);
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());


    }
}
