package com.kodilla.good.patterns.challenges.Food2DoorService;

public class ProductBaseRepo implements ProductRepository {
    @Override
    public void createProduct(Client client, Product product) {
        ShopInterface shopInterface=null;
        System.out.println("Client: "+client.getName()+" created order for product: "+product.getName()+"("+product.getQuantity()+"). Total price: "+product.getQuantity()*product.getPrice()+". \nShop: ");
    }
}
