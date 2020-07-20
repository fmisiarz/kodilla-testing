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
        for (int i=0; i<10;i++) {
            numbers.add(i + 1);
        }
        ArrayList<Integer> listVar=new ArrayList<Integer>();
        ArrayList<Integer> listVar2;
        listVar2=ext1.exterminate(numbers);
        listVar.add(2); listVar.add(4); listVar.add(6); listVar.add(8); listVar.add(10);
        System.out.println("Comparing expected list: "+listVar+" with actual: "+listVar2);
        Assert.assertEquals(listVar,listVar2);
    }
    }

