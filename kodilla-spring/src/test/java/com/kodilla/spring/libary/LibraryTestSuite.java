package com.kodilla.spring.libary;

import com.kodilla.spring.library.Libary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {
    @Test
    public void testLoadFromDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Libary libary = context.getBean(Libary.class);
        //When
        libary.loadFromDb();
        //Then
        //Do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Libary libary = context.getBean(Libary.class);
        //When
        libary.saveToDb();
        //Then
        //Do nothing
    }
}
