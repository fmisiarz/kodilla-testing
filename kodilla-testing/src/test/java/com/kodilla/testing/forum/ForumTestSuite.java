package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
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
    public void testCaseUsername(){
        SimpleUser user1 =new SimpleUser("Wlad123","Wladyslaw");
        String result = user1.getUsername();
        System.out.println("Testing the: "+result);
        Assert.assertEquals("Wlad123",result);

    }
    @Test
    public void testCaseRealName(){
        SimpleUser user1= new SimpleUser("Wlad123","Wladyslaw");
        String result=user1.getRealName();
        System.out.println("Testing the: "+result);
        Assert.assertEquals("Wladyslaw",result);

    }
}
