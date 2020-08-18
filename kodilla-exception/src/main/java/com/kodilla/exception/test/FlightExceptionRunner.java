package com.kodilla.exception.test;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Amsterdam", "Lublin");
        Flight flight2 = new Flight("Warszawa", "Dublin");
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.findFlight(flight1);
    }
}
