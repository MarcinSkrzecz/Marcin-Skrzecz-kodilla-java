package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
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

    }
}