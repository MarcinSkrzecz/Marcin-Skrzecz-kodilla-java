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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.bok, bok) != 0) return false;
        if (Double.compare(triangle.wysokosc, wysokosc) != 0) return false;
        return shapeName != null ? shapeName.equals(triangle.shapeName) : triangle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(bok);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(wysokosc);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
