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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.promien, promien) != 0) return false;
        return shapeName != null ? shapeName.equals(circle.shapeName) : circle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(promien);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
