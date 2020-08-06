package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.sql.SQLOutput;
import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        People.getList().stream().filter(s -> s.length()<11).forEach(System.out::println);
        BookDirectory theBookDirectory=new BookDirectory();
        String ResultString=theBookDirectory.getList().stream().filter
                (book -> book.getYearOfPublication()>2000).map(Book::toString).collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(ResultString);
        System.out.println("ZADANIE 7.3");
        Map <Integer,ForumUser> MapForumUser=Forum.getUserList().stream().filter(forumUser-> forumUser.getGender()=='M')
                .filter(forumUser->forumUser.getDateOfBirth().getYear()<2000)
                .filter(forumUser -> forumUser.getPosts()>1)
                .collect(Collectors.toMap(ForumUser::getIDN,ForumUser->ForumUser));
        MapForumUser.entrySet().stream().map(entry->entry.getKey()+", "+entry.getValue()).forEach(System.out::println);


    }

}