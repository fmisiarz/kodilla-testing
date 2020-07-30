package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int a;
    public Circle(int a){
        this.a=a;
    }
    private String ShapeName="Circle";
    private int Field;
    @Override

    public String getShapeName() {
        return ShapeName;

    }

    @Override
    public int getField() {
return Field;
    }
    @Override
    public String toString(){
        return getShapeName();
    }
}
