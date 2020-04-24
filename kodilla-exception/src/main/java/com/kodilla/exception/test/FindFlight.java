package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<String, Boolean>();
        flightMap.put("Warszawa", true);
        flightMap.put("Bydgoszcz", true);
        flightMap.put("Gdansk", false);
        flightMap.put("Szczecin", false);
        flightMap.put("Wyszkow", true);

        if(flightMap.containsKey(flight.getArrivalAirport()) && flightMap.get(flight.getArrivalAirport()) == true) {
            System.out.println("We have found airport in Your destination city!");
        } else {
            throw new RouteNotFoundException("Destination airport not found!");
        }
    }

    public static void main (String[] args){

        Flight flight = new Flight("Warsaw", "Szczecin");
        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFilght(flight);
        } catch (RouteNotFoundException rnfe) {
            System.out.println("Destination airport not found," +
                    "but my program still running very well!");
        }

        System.out.println("Program finished checks");
    }
}