package com.kodilla.good.patterns.challenges.Food2DoorService;

public class applic {
    public static void main(String[] args) {
ProductRequestRetriever productRequestRetriever=new ProductRequestRetriever();
ProductRequest productRequest= productRequestRetriever.retrieve();
    Processor processor=new Processor(new ExtraFoodShop(),new MailService(),new ProductBaseRepo());
    processor.process(productRequest);
    }
}