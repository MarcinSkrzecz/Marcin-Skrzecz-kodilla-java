package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book b1 = new Book("A","A A", LocalDate.now().plusMonths(1));
        Book b2 = new Book("B","B B",LocalDate.now().plusMonths(2));
        Book b3 = new Book("C","C C",LocalDate.now().plusMonths(3));
        Book b4 = new Book("D","D D",LocalDate.now().plusMonths(4));
        Book b5 = new Book("E","E E",LocalDate.now().plusMonths(5));

        Library library = new Library("Library 1");
        library.getBooks().add(b1);
        library.getBooks().add(b2);
        library.getBooks().add(b3);
        library.getBooks().add(b4);
        library.getBooks().add(b5);

        //making a shallow clone of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(b5);

        //Then
        System.out.println(library.getName());
        System.out.println(library.getBooks());
        System.out.println(cloneLibrary.getName());
        System.out.println(cloneLibrary.getBooks());
        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(4,library.getBooks().size());
        Assert.assertEquals(4,cloneLibrary.getBooks().size());
        Assert.assertEquals(5,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());
    }
}
