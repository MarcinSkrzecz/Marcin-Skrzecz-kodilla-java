package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Wake up");
        board.getInProgressList().addTask("Start coding");
        board.getDoneList().addTask("Sleep well");

        //Then
        Assert.assertEquals("Wake up",board.getToDoList().getFirstTasks());
        Assert.assertEquals("Start coding",board.getInProgressList().getFirstTasks());
        Assert.assertEquals("Sleep well",board.getDoneList().getFirstTasks());
    }
}
