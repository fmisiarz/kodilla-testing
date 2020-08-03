package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
       //SaySomething saySomething = new SaySomething();
       // saySomething.say();
       // ExecuteSaySomething executeSaySomething=new ExecuteSaySomething();
       // Processor processor=new Processor();
       // Executor codeToExecute = () -> System.out.println("LOL");
        //processor.execute(codeToExecute);
                            //LAMBDA
        ExpressionExecutor expressionExecutor= new ExpressionExecutor();
        expressionExecutor.executeExpression(5,15,(a, b) -> a+b);
        expressionExecutor.executeExpression(5,15,(a, b) -> a-b);
        expressionExecutor.executeExpression(5,15,(a, b) -> a*b);
        expressionExecutor.executeExpression(5,15,(a, b) -> a/b);

                     // FUNKCJE
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
      //  expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        //processor.execute(executeSaySomething);

                        //ZADANIE 7.1
PoemBeautifier poemBeautifier=new PoemBeautifier();
poemBeautifier.beautify("Text to decorate","ABC",(textToDecore,ABC)->ABC+textToDecore+ABC);
        poemBeautifier.beautify("Text to decorate","ABC",(textToDecore,ABC)->textToDecore.toUpperCase());
        poemBeautifier.beautify("Text to decorate","ABC",(textToDecore,ABC)->"Trying to uderstand "+textToDecore.toUpperCase());
        poemBeautifier.beautify("Text to decorate","ABC",(textToDecore,ABC)->textToDecore+". GOT IT");
        System.out.println("Using Stream to generate even numbers from 1 to 13");
        NumbersGenerator.generateEven(13);
    }
}