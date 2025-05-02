package com.kotari;

public record Rectangle(    double length,
    double width
) implements Shape {

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle(length=%.2f, width=%.2f)", length, width);
    }
}
