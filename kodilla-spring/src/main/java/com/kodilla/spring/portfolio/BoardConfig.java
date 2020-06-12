package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Qualifier("toDoTaskList")
    @Autowired
    private TaskList toDoList;

    @Qualifier("inProgressTaskList")
    @Autowired
    private TaskList inProgressTaskList;

    @Qualifier("doneTaskList")
    @Autowired
    private TaskList doneTaskList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressTaskList, doneTaskList);
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
