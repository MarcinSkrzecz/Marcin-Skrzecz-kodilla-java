package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

public final class Libary {
    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public Libary(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Libary() {

    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
