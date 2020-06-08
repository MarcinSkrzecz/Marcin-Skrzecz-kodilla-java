package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public String getFirstTasks() {
        return tasks.get(0);
    }

    public void addTask(String task){
        tasks.add(task);
    }
}
