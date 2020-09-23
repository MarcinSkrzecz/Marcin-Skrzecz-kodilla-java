package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTask mod99 = new Module_99();
        StudentTask mod66 = new Module_66();
        Mentor nr1 = new Mentor("Xxx", "Yyy");
        Mentor nr2 = new Mentor("Yyy", "Xxx");
        mod66.registerObserver(nr1);
        mod99.registerObserver(nr2);
        //When
        mod66.addPost("x");
        mod66.addPost("y");
        mod99.addPost("xx");
        mod99.addPost("yy");
        //Then
        assertEquals(2, nr1.getUpdateCount());
        assertEquals(2, nr2.getUpdateCount());
    }
}
