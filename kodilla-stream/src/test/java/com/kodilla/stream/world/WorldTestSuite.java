package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    //Given
    @Test
    public void testGetPeopleQuantity() {
        Country poland = new Country("Poland", new BigDecimal("38420687"));
        Country deuthschland = new Country("Deutschland", new BigDecimal("80457737"));

        Country china = new Country("China", new BigDecimal("1401585247"));
        Country india = new Country("India", new BigDecimal("1296834042"));

        Country usa = new Country("USA", new BigDecimal("329256465"));
        Country canada = new Country("Canada", new BigDecimal("35881659"));

        Country algieria = new Country("Algeria", new BigDecimal("41657488"));
        Country uganda = new Country("Uganda", new BigDecimal("40853749"));

        Country wenezuela = new Country("Wenezuela", new BigDecimal("31689176"));
        Country peru = new Country("Peru", new BigDecimal("31331288"));

        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        Continent northAmerica = new Continent();
        Continent southAmerica = new Continent();

        europe.addCountry(poland);
        europe.addCountry(deuthschland);
        asia.addCountry(china);
        asia.addCountry(india);
        africa.addCountry(uganda);
        africa.addCountry(algieria);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        southAmerica.addCountry(wenezuela);
        southAmerica.addCountry(peru);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal testWorldPeopleQuantity = new BigDecimal("3327967538");
        Assert.assertEquals(testWorldPeopleQuantity, worldPeopleQuantity);
    }
}
