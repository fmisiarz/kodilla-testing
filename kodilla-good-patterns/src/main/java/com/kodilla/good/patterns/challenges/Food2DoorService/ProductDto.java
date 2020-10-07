package com.kodilla.good.patterns.challenges.Food2DoorService;

public class ProductDto {
    public Client client;
    public boolean isDone;

    public ProductDto(final Client client,final boolean isDone) {
        this.client = client;
        this.isDone = isDone;
    }

    public Client getClient() {
        return client;
    }

    public boolean isDone() {
        return isDone;
    }
}
