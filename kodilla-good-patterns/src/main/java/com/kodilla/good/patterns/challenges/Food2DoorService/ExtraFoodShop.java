package com.kodilla.good.patterns.challenges.Food2DoorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtraFoodShop implements ShopInterface{
    private String productName;
    private int productQ;
    private double productPrice;

    public ExtraFoodShop(String productName,int productQ,double productPrice){
    this.productName=productName;
    this.productPrice=productPrice;
    this.productQ=productQ;
}
public ExtraFoodShop extraFoodShop1=new ExtraFoodShop("ExtraEggs",112,2.25);
public ExtraFoodShop extraFoodShop2=new ExtraFoodShop("ExtraMilk",15,4.15);
    public void process(){

    }
}
