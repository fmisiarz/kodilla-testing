package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;
private List<Flight> flightList=new ArrayList<Flight>();

    public List<Flight> getFlightList() {
        return flightList;
    }

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
