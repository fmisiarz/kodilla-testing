package com.kodilla.testing.shape;
import com.kodilla.testing.forum.ForumComment;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollectorTestSuite {
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
    public void testAddFigure() {
        Square square = new Square(5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(7);
        ShapeCollector shapeCollector = new ShapeCollector(){{
            addFigure(square);
            addFigure(triangle);
            addFigure(circle);
        }};
        Assert.assertEquals(3, shapeCollector.shapeArrayList.size());
    }
    @Test
    public void testGetFigure() {
        Square square=new Square(5);
        Circle circle=new Circle(3);
        Triangle triangle=new Triangle(7);
        ShapeCollector shapeCollector=new ShapeCollector(){{
            addFigure(square);
            addFigure(triangle);
            addFigure(circle);

        }};

        Assert.assertEquals(circle,shapeCollector.getFigure(2));


    }
    @Test
    public void testShowFigures() {
        Square square=new Square(5);
        Circle circle=new Circle(3);
        Triangle triangle=new Triangle(7);
        ShapeCollector shapeCollector=new ShapeCollector(){{
            addFigure(square);
            addFigure(triangle);
            addFigure(circle);

        }};
        List<Shape> expected = Arrays.asList(square,triangle,circle);
        Assert.assertEquals(expected,shapeCollector.showFigures());
    }

}