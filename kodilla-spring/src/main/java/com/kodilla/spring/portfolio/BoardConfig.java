package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean
    public Board getBoard() {
        return new Board(toDoTaskList(), inProgressTaskList(), doneTaskList());
    }

    @Bean
    public TaskList toDoTaskList() {
        return new TaskList();
    }

    @Bean
    public TaskList inProgressTaskList() {
        return new TaskList();
    }

    @Bean
    public TaskList doneTaskList() {
        return new TaskList();
    }
}
