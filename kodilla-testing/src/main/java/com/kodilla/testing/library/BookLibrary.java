package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<Book>();
        String firstName = libraryUser.getFirstname();
        String lastName = libraryUser.getLastname();
        String peselID = libraryUser.getPeselId();
        List<Book> resultlist = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (firstName.equals(libraryUser.getFirstname()) && lastName.equals(libraryUser.getLastname()) && peselID.equals(libraryUser.getPeselId())) {
            bookList = resultlist;
        }
        return bookList;
    }
}
