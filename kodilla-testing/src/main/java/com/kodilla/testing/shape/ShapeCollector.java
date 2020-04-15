package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
        public int shapesSize() {
            return shapes.size();
        }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public String getFigure(int n) {
        String shape = null;
        if(n >= 0 && n < shapes.size()) {
            shape = shapes.get(n).getShapeName();
        }
        return shape;
    }

    public void showFigures() {
        for(int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return shapes != null ? shapes.equals(that.shapes) : that.shapes == null;
    }

    @Override
    public int hashCode() {
        return shapes != null ? shapes.hashCode() : 0;
    }
}