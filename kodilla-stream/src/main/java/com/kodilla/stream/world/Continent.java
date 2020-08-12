package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String nameContinent;
    private final List<Country> countryList;

    public Continent(final String nameContinent,final List<Country> countryList) {
        this.nameContinent = nameContinent;
        this.countryList=countryList;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
