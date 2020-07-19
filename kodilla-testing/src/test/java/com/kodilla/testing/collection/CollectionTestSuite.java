package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: BEGIN !");

    }
    @After
    public void after(){
        System.out.println("Test case: END!");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suit: BEGIN");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suit: END!");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        System.out.println("Testing empty list");
        OddNumbersExterminator ext1= new OddNumbersExterminator();
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        for (int i=0; i<0;i++) {
            numbers.add(i + 1);
        }
        Integer listSize=numbers.size();
        Integer zero=0;
        ext1.exterminate(numbers);
        Assert.assertEquals(zero,listSize);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        System.out.println("Testing normal list");
        OddNumbersExterminator ext1= new OddNumbersExterminator();
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        for (int i=0; i<52;i++) {
            numbers.add(i + 1);
        }
        Integer listSize=numbers.size();
        Integer sizeIs=52;
        ext1.exterminate(numbers);
        Assert.assertEquals(sizeIs,listSize);
    }
    }

