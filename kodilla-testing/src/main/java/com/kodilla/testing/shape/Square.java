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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.bok, bok) != 0) return false;
        return shapeName != null ? shapeName.equals(square.shapeName) : square.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(bok);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
