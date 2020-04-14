package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName = "Triangle";
    private double bok;
    private double wysokosc;

    public Triangle(double bok, double wysokosc) {
        this.bok = bok;
        this.wysokosc = wysokosc;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (0.5 * this.bok * this.wysokosc);
    }
}
