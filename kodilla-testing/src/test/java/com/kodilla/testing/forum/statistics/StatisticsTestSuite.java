package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.statistics.StatClass;
import org.junit.*;
import org.junit.Test;
import org.junit.Assert;

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
        StatClass statistics = new StatClass(statisticsMock);
        statistics.postsCount = 0;
        statistics.showStatistics();
        Assert.assertEquals(0, statistics.postsCount());
    }

    @Test
    public void testWhenPostThous() {
        Statistics statisticsMock = mock(Statistics.class);
        StatClass statistics = new StatClass(statisticsMock);
        statistics.CommentCount = 170;
        statistics.postsCount = 1000;
        System.out.println(statistics.getCommentAveragePerPost());
        statistics.showStatistics();
        Assert.assertEquals(1000, statistics.postsCount());
    }

}