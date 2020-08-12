package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {
    private final List<Continent> continentList;

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(Continent -> Continent.getCountryList()
                        .stream()).map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public World(List<Continent> continentList) {
        this.continentList = continentList;

    }
}
