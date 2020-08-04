package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.statistics.StatClass;
import org.junit.*;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: BEGIN !");

    }

    @After
    public void after() {
        System.out.println("Test case: END!");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suit: BEGIN");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test suit: END!");
    }

    @Test
    public void testWhenPostZero() {
        Statistics statisticsMock = mock(Statistics.class);
        StatClass statClass = new StatClass(statisticsMock);
        List<String> resUserNames=new ArrayList<>();
        resUserNames.add("Filip");
        resUserNames.add("Karol");
        when(statisticsMock.usersNames()).thenReturn(resUserNames);
        int resCommentsCount=11;
        when(statisticsMock.commentsCount()).thenReturn(resCommentsCount);
        int resPostsCount=114;
        when(statisticsMock.postsCount()).thenReturn(resPostsCount);
        statClass.showStatistics();
       // Assert.assertEquals(0, statistics.getPostsCount());
    }

    @Test
    public void testWhenPostThous() {
        Statistics statisticsMock = mock(Statistics.class);
        //StatClass statistics = new StatClass(statisticsMock);
       // System.out.println(statistics.getCommentAveragePerPost());
       // statistics.showStatistics();
       // Assert.assertEquals(0, statistics.getPostsCount());
    }

}