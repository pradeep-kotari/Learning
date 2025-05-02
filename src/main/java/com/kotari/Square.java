package com.kotari;

public record Square(    double side
) implements Shape {

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return String.format("Square(side=%.2f)", side);
    }
}
