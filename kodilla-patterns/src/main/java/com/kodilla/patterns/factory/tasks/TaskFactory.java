package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task performTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Zakupy","Mleko",8);
            case PAINTING:
                return new PaintingTask("Pomalować ścianę","Czarny","Mrok");
            case DRIVING:
                return new DrivingTask("Zakupy","W sklepie","Auto");
            default:
                return null;
        }
    }
}