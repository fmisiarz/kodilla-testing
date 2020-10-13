package com.kodilla.good.patterns.challenges.Food2DoorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtraFoodShop implements ShopInterface{
    private boolean process;
    @Override
    public String getShopName() {
        String shopName = "ExtraFoodShop";
    return shopName;}
    public boolean process(Client client,Product product){
        return true;
    }
}
