package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "Square";
    private double bok;

    public Square(double bok) {
        this.bok = bok;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (this.bok * this.bok);
    }
}
