package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.stream.Collectors;
import java.util.*;
import java.time.LocalDate;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<Integer, ForumUser> result = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getCountOfUserPosts() > 0)
                .filter(user -> user.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("# elements: " + result.size());
        result.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}




/*
     import com.kodilla.stream.beautifier.PoemDecorator;
     import com.kodilla.stream.iterate.NumbersGenerator;
     import com.kodilla.stream.lambda.Processor;
     import com.kodilla.stream.lambda.ExpressionExecutor;
     import com.kodilla.stream.reference.FunctionalCalculator;
     import com.kodilla.stream.beautifier.PoemBeautifier;
     import com.kodilla.stream.person.People;
     import com.kodilla.stream.book.Book;
     import com.kodilla.stream.book.BookDirectory;
//-------------------------------------------------------------------------

    Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

//-------------------------------------------------------------------------

                ExpressionExecutor expressionExecutor = new ExpressionExecutor();

                expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
                expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
                expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
                expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


                System.out.println("Calculating expressions with method references");
                expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
                expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
                expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
                expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//---------------------------------------------------------------------------------------------------------

                PoemDecorator nr1 = text -> text.concat(" ... Work in progress");
                PoemDecorator nr2 = text -> "ABC ~ " + text + " ~ ABC";
                PoemDecorator nr3 = text -> text.toUpperCase();
                PoemDecorator nr4 = text -> "Beatuified text: ||" + text + "|| contains " + text.length() + " signs";

                PoemBeautifier poemBeautifier = new PoemBeautifier();

                System.out.println(poemBeautifier.beautify("Text to beautify", nr1));
                System.out.println(poemBeautifier.beautify("Text to beautify", nr2));
                System.out.println(poemBeautifier.beautify("Text to beautify", nr3));
                System.out.println(poemBeautifier.beautify("Text to beautify", nr4));

//-----------------------------------------------------------------------------------------------------------

                System.out.println("Using Stream to generate even numbers from 1 to 20");
                NumbersGenerator.generateEven(20);

//-----------------------------------------------------------------------------------------------------------

                People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

 //-----------------------------------------------------------------------------------------------------------

                People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

 //-----------------------------------------------------------------------------------------------------------

                BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

//-----------------------------------------------------------------------------------------------------------

                BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

  //-----------------------------------------------------------------------------------------------------------

                BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

     //-----------------------------------------------------------------------------------------------------------

                BookDirectory theBookDirectory = new BookDirectory();
    String theResultStringOfBooks = theBookDirectory.getList().stream()
            .filter(book -> book.getYearOfPublication() > 2005)
            .map(Book::toString)
            .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);





 */