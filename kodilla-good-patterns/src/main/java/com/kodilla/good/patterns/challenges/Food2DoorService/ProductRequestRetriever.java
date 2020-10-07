package com.kodilla.good.patterns.challenges.Food2DoorService;

public class ProductRequestRetriever {
    public ProductRequest retrieve(){
        Client client1=new Client("Filip","hot@ail.com",516765123);
        Product product1=new Product("Apple",3,0.59);
        return new ProductRequest(client1,product1);
    }
}
