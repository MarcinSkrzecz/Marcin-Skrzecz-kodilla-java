package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTask  implements ObservableHomework {
    private final List<ObserverHomework> observers;
    private final List<String> messages;
    private final String moduleName;

    public StudentTask(String moduleName) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.moduleName = moduleName;
    }

    public void addPost(String post) {
        messages.add(post);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomework observerHomework) {
        observers.add(observerHomework);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHomework observerHomework : observers) {
            observerHomework.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHomework observerHomework) {
        observers.remove(observerHomework);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getModuleName() {
        return moduleName;
    }
}
