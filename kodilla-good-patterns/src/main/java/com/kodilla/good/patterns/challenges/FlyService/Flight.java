package com.kodilla.good.patterns.challenges.FlyService;

public class Flight {
    private City from;
    private City to;

    public Flight(City from, City to) {
        this.from = from;
        this.to = to;
    }

    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    @Override
    public String toString() {
        return to +""+from;

    }

}
