package com.kodilla.good.patterns.challenges.Food2DoorService;

public class GlutenFreeShop implements ShopInterface{
    private String shopName="GlutenFreeShop";
private boolean process;
    @Override
    public String getShopName() {
        return shopName;
    }
        public boolean process(Client client,Product product){
            return true;


    }
}
