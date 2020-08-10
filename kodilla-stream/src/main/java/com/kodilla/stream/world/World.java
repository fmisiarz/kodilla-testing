package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {
public List<Continent> ContinentList = new ArrayList<>();
public BigDecimal getPeopleQuantity(){
    return ContinentList.stream().flatMap(Continent->Continent.CountryList.stream()).map(Country::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
}
}
