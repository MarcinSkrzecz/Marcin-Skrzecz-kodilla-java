package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception {
    public static String ERR_EMPTY_TABLE = "Table is empty";

    public SearchingException(String message) {
        super(message);
    }
}
