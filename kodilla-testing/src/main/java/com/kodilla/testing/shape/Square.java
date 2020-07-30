package com.kodilla.testing.shape;

import java.lang.invoke.SwitchPoint;

public class Square implements Shape {
    private int a;
    public Square(int a){
        this.a=a;
    }
    private String ShapeName="Square";
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
