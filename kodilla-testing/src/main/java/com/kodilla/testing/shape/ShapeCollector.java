package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private int figVar;
    private Shape shape;

    public ArrayList<Shape> shapeArrayList=new ArrayList<Shape>();
public void addFigure(Shape shape){
    shapeArrayList.add(shape);
}
public Shape getFigure(int n){
    return shapeArrayList.get(n);
}
public ArrayList<Shape> showFigures() {
    return  shapeArrayList;
    }

    }






