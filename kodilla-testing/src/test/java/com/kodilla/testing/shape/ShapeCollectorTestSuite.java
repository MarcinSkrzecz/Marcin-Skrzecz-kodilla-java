package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Square(5);
        //When
        collector.addFigure(shape);
        //Then
        Assert.assertEquals(1, collector.shapesSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Square(5);
        //When
        boolean result = collector.removeFigure(shape);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Square(5);
        collector.addFigure(shape);
        //When
        String getShape = collector.getFigure(0);
        //Then
        Assert.assertEquals(shape.getShapeName(), getShape);
    }
}
