package com.kotari;

public record Circle(    double radius
) implements Shape {

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.2f)", radius);
    }
}
