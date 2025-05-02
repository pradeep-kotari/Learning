package com.kotari;

public sealed interface Shape permits Circle, Rectangle, Square {
    double area();
    double perimeter();
}
