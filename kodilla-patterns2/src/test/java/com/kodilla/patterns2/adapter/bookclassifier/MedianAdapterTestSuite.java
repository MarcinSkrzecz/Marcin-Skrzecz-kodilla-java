package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<Book> bookASet = new HashSet<>();
        bookASet.add(new Book("AAA", "BBB",2000, "CCC"));
        bookASet.add(new Book("DDD", "EEE", 2010, "FFF"));
        bookASet.add(new Book("GGG", "HHH", 2020, "III"));

        //When+Then
        assertEquals(2010, medianAdapter.publicationYearMedian(bookASet));
    }
}
