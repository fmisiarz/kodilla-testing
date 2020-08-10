package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        World world = new World();
        Continent Europe=new Continent("Europe");
        Continent Africa=new Continent("Africa");
        Continent Asia=new Continent("Asia");
        world.ContinentList.add(Europe);
        world.ContinentList.add(Africa);
        world.ContinentList.add(Asia);

        //EUROPE
        BigDecimal RussiaQ=new BigDecimal("145934462");
        BigDecimal UnitedKingdomQ=new BigDecimal("67886011");
        BigDecimal GermanyQ=new BigDecimal("83783942");

        Country Russia=new Country("Russia",RussiaQ);
        Country UnitedKingdom=new Country("United Kingdom",UnitedKingdomQ);
        Country Germany=new Country("Germany",GermanyQ);

        Europe.CountryList.add(Russia);
        Europe.CountryList.add(UnitedKingdom);
        Europe.CountryList.add(Germany);
        //AFRICA
        BigDecimal NigeriaQ=new BigDecimal("206139589");
        BigDecimal EthiopiaQ=new BigDecimal("114963588");
        BigDecimal EgyptQ=new BigDecimal("102334404");

        Country Nigeria=new Country("Nigeria",NigeriaQ);
        Country Ethiopia=new Country("Ethiopia",EthiopiaQ);
        Country Egypt=new Country("Egypt",EgyptQ);
        Africa.CountryList.add(Nigeria);
        Africa.CountryList.add(Ethiopia);
        Africa.CountryList.add(Egypt);
        //ASIA
        BigDecimal ChinaQ=new BigDecimal("1439323776");
        BigDecimal IndiaQ=new BigDecimal("1380004385");
        BigDecimal IndonesiaQ=new BigDecimal("273523615");
        Country China=new Country("China",ChinaQ);
        Country India=new Country("India",IndiaQ);
        Country Indonesia=new Country("Indonesia",IndonesiaQ);
        Asia.CountryList.add(China);
        Asia.CountryList.add(India);
        Asia.CountryList.add(Indonesia);
        BigDecimal expected = new BigDecimal("3813893772");
        Assert.assertEquals(expected,world.getPeopleQuantity());

    }
}
