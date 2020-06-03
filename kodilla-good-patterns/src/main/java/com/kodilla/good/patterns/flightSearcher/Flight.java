package com.kodilla.good.patterns.flightSearcher;

public class Flight {
    private String cityFrom;
    private String cityTo;
    private int departureTime;
    private int flightTime;

    public Flight(String cityFrom, String cityTo, int departureTime, int flightTime) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.departureTime = departureTime;
        this.flightTime = flightTime;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public int getFlightTime() {
        return flightTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departureTime != flight.departureTime) return false;
        if (flightTime != flight.flightTime) return false;
        if (cityFrom != null ? !cityFrom.equals(flight.cityFrom) : flight.cityFrom != null) return false;
        return cityTo != null ? cityTo.equals(flight.cityTo) : flight.cityTo == null;
    }

    @Override
    public int hashCode() {
        int result = cityFrom != null ? cityFrom.hashCode() : 0;
        result = 31 * result + (cityTo != null ? cityTo.hashCode() : 0);
        result = 31 * result + departureTime;
        result = 31 * result + flightTime;
        return result;
    }

    @Override
    public String toString() {
        return  "City from: " + cityFrom +
                " || City to: " + cityTo +
                " || Departure time: " + departureTime +
                " || Flight time: " + flightTime;
    }
}
