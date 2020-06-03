package com.kodilla.good.patterns.flightSearcher;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public List<Flight> getFlightList() {
        Flight f1 = new Flight("Warszawa","Bydgoszcz",10,2);
        Flight f2 = new Flight("Bydgoszcz", "Warszawa",12,2);
        Flight f3 = new Flight("Warszawa","Gdańsk",16,4);

        Flight f4 = new Flight("Bydgoszcz","Gdańsk",14,2);
        Flight f5 = new Flight("Gdańsk","Bydgoszcz",11,2);

        Flight f6 = new Flight("Wrocław","Warszawa",14,2);
        Flight f7 = new Flight("Gdańsk","Wrocław",11,2);

        List<Flight> ourFlightListOffer = new ArrayList<>();

        ourFlightListOffer.add(f1);
        ourFlightListOffer.add(f2);
        ourFlightListOffer.add(f3);
        ourFlightListOffer.add(f4);
        ourFlightListOffer.add(f5);
        ourFlightListOffer.add(f6);
        ourFlightListOffer.add(f7);

        return new ArrayList<>(ourFlightListOffer);
    }
}
