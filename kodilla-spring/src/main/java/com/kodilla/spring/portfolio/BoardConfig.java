package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    Board board;

    @Bean
    public Board getBoard() {
        return new Board(toDoTaskList(), inProgressTaskList(), doneTaskList());
    }

    @Bean(name = "toDoTaskList")
    @Scope("prototype")
    public TaskList toDoTaskList() {
        return new TaskList();
    }

    @Bean(name = "inProgressTaskList")
    @Scope("prototype")
    public TaskList inProgressTaskList() {
        return new TaskList();
    }

    @Bean(name = "doneTaskList")
    @Scope("prototype")
    public TaskList doneTaskList() {
        return new TaskList();
    }
}
