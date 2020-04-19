package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentWorld = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentWorld.add(continent);
    }

    public void removeContinent(Continent continent) {
        continentWorld.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continentWorld.stream()
                .flatMap(people -> people.getCountryContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}


    //Klasa World powinna zawierać kolekcję kontynentów

    //W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal,
   // która używając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.