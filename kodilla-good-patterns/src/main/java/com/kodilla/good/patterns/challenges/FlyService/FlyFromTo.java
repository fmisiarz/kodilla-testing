package com.kodilla.good.patterns.challenges.FlyService;

public class FlyFromTo {
    private final String flyFrom;
    private final String flyTo;

    public FlyFromTo(String flyFrom, String flyTo) {
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }
    @Override
    public String toString() {
        return "\nFrom: " + flyFrom +
                ", To: " + flyTo+"\n";
    }


}
