package com.kodilla.testing.forum.tdd;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
public class ForumTestSuite {
    private static int testCounter=0;
    @BeforeClass
        public static void beforeAllTests(){
            System.out.println("This is the beginning of the test!");
        }
        @AfterClass
            public static void afterAllTests(){
                System.out.println("This is the end of all tests!");


        }
        @Before

            public void beforeEveryTest(){
                testCounter++;
        System.out.println("Preparing to execute test #"+testCounter);
        }
        }


