package com.kodilla.good.patterns.flightSearcher;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchProcessor {

    public void searchFlightFromCity(FlightList flightList, String cityFrom) {
        List<Flight> flightFrom = flightList.getFlightList().stream()
                .filter(f -> f.getCityFrom().equals(cityFrom))
                .collect(Collectors.toList());
        System.out.println("We have found this list of flights from selected city: " + cityFrom);
        flightFrom.stream()
                .forEach(System.out::println);
    }

    public void searchFlightToCity(FlightList flightList, String cityTo) {
        List<Flight> flightTo = flightList.getFlightList().stream()
                .filter(f -> f.getCityTo().equals(cityTo))
                .collect(Collectors.toList());
        System.out.println("We have found this list of flights to selected city: " + cityTo);
        flightTo.stream()
                .forEach(System.out::println);
    }

    public void searchForFlight(FlightList flightList, String cityFrom, String cityTo) {
        //First part for single flight
        List<Flight> flightInOneGo = flightList.getFlightList().stream()
                .filter(f -> f.getCityFrom().equals(cityFrom))
                .filter(f -> f.getCityTo().equals(cityTo))
                .collect(Collectors.toList());
        int sizeInOneGo = flightInOneGo.size();
        if (sizeInOneGo > 0) {
            System.out.println("We have found this list of flights in one go:");
            flightInOneGo.stream()
                    .forEach(System.out::println);
        } else {
            List<Flight> flightFrom = flightList.getFlightList().stream()
                    .filter(f -> f.getCityFrom().equals(cityFrom))
                    .collect(Collectors.toList());

            List<Flight> flightTo = flightList.getFlightList().stream()
                    .filter(f -> f.getCityTo().equals(cityTo))
                    .collect(Collectors.toList());

            List<Flight> connectFromToAndToFrom = flightFrom.stream()
                    .filter(f ->
                            (flightTo.stream()
                                    .map(Flight::getCityFrom)
                                    .collect(Collectors.toList()))
                                    .contains(f.getCityTo()))
                    .collect(Collectors.toList());

            int sizeConnection = connectFromToAndToFrom.size();
            if (sizeConnection > 0) {

                List<Flight> ifConnectionFoundSecondFlight = flightTo.stream()
                        .filter(f ->
                                (flightFrom.stream()
                                        .map(Flight::getCityTo)
                                        .collect(Collectors.toList()))
                                        .contains(f.getCityFrom()))
                        .collect(Collectors.toList());

                for (int i = 0;i < sizeConnection;i++) {
                    System.out.println("---------------------------");
                    System.out.println("We have found first of connected change flights:");
                    System.out.println(connectFromToAndToFrom.get(i));
                    System.out.println("Your second flight will be:");
                    System.out.println(ifConnectionFoundSecondFlight.get(i));
                    System.out.println("---------------------------");
                }
            } else {
                System.out.println("We have not found any flights");
            }
        }
    }
}