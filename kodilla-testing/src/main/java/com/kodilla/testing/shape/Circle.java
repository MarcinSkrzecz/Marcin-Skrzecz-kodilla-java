package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName = "Circle";
    private double promien;

    public Circle(double promien) {
        this.promien = promien;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (3.14 * this.promien * this.promien);
    }
}
