package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private BigDecimal PeopleQuantity=BigDecimal.ZERO;

    public Country(final String name, final BigDecimal peopleQuantity) {
        this.name = name;
        PeopleQuantity = peopleQuantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", PeopleQuantity=" + PeopleQuantity +
                '}';
    }
}
