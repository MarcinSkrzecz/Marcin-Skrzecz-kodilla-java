package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countryContinent = new ArrayList<>();

    public void addCountry(Country country) {
        countryContinent.add(country);
    }

    public void removeCountry(Country country) {
        countryContinent.remove(country);
    }

    public List<Country> getCountryContinent() {
        return countryContinent;
    }
}

    //Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.