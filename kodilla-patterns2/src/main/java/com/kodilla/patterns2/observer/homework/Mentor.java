package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomework {
    private final String name;
    private final String surname;
    private int updateCount;

    public Mentor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void update(StudentTask studentTask) {
        System.out.println(name + " " + surname + ": New respond in module " + studentTask.getModuleName() + "\n" +
                " (total: " + studentTask.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
