package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        List<Continent> continentList = new ArrayList<Continent>();
        List<Country> countryListForEurope = new ArrayList<Country>();
        List<Country> countryListForAfrica = new ArrayList<Country>();
        List<Country> countryListForAsia = new ArrayList<Country>();

        World world = new World(continentList);
        Continent Europe = new Continent("Europe", countryListForEurope);
        Continent Africa = new Continent("Africa", countryListForAfrica);
        Continent Asia = new Continent("Asia", countryListForAsia);
        continentList.add(Europe);
        continentList.add(Africa);
        continentList.add(Asia);

        BigDecimal RussiaQ = new BigDecimal("145934462");
        BigDecimal UnitedKingdomQ = new BigDecimal("67886011");
        BigDecimal GermanyQ = new BigDecimal("83783942");
        BigDecimal NigeriaQ = new BigDecimal("206139589");
        BigDecimal EthiopiaQ = new BigDecimal("114963588");
        BigDecimal EgyptQ = new BigDecimal("102334404");
        BigDecimal ChinaQ = new BigDecimal("1439323776");
        BigDecimal IndiaQ = new BigDecimal("1380004385");
        BigDecimal IndonesiaQ = new BigDecimal("273523615");

        Country Russia = new Country("Russia", RussiaQ);
        Country UnitedKingdom = new Country("United Kingdom", UnitedKingdomQ);
        Country Germany = new Country("Germany", GermanyQ);
        Country Nigeria = new Country("Nigeria", NigeriaQ);
        Country Ethiopia = new Country("Ethiopia", EthiopiaQ);
        Country Egypt = new Country("Egypt", EgyptQ);
        Country China = new Country("China", ChinaQ);
        Country India = new Country("India", IndiaQ);
        Country Indonesia = new Country("Indonesia", IndonesiaQ);


        countryListForEurope.add(Russia);
        countryListForEurope.add(UnitedKingdom);
        countryListForEurope.add(Germany);

        countryListForAfrica.add(Nigeria);
        countryListForAfrica.add(Ethiopia);
        countryListForAfrica.add(Egypt);


        countryListForAsia.add(China);
        countryListForAsia.add(India);
        countryListForAsia.add(Indonesia);
        BigDecimal expected = new BigDecimal("3813893772");
        Assert.assertEquals(expected, world.getPeopleQuantity());

    }
}
