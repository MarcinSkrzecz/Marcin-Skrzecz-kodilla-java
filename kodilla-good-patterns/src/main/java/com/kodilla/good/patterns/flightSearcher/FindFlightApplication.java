package com.kodilla.good.patterns.flightSearcher;

public class FindFlightApplication {

    public static void main(String[] args) {

        FlightList flightList = new FlightList();
        FlightSearchProcessor flightSearchProcessor = new FlightSearchProcessor();


        flightSearchProcessor.searchForFlight(flightList,"Gdańsk","Warszawa");
    }
}
