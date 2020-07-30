package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int a;
    public Triangle(int a){
        this.a=a;
    }
    private String ShapeName="Triangle";
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
