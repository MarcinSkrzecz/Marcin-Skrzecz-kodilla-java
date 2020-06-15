package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testTaskShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.performTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("Zakupy",shopping.getTaskName());
        Assert.assertEquals(true,shopping.isTaskExecuted());
    }

    @Test
    public void testTaskPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.performTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Pomalować ścianę",painting.getTaskName());
        Assert.assertNotEquals(true,painting.isTaskExecuted());
    }

    @Test
    public void taskTestDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.performTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("Zakupy",driving.getTaskName());
        Assert.assertEquals(true,driving.isTaskExecuted());
    }
}
