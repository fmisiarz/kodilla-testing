package com.kodilla.good.patterns.challenges.Food2DoorService;

public class HealthyShop implements ShopInterface{
    private String shopName="HealthyShop";
private boolean process;
    @Override
    public String getShopName() {
        return shopName;
    }
    public boolean process(Client client,Product product){
        return true;
    }
}
