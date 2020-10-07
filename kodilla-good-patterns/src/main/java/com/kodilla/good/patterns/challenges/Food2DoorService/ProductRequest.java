package com.kodilla.good.patterns.challenges.Food2DoorService;

public class ProductRequest {
    private Client client;
    private Product product;
    public ProductRequest(Client client, Product product) {
        this.client = client;
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }
}
