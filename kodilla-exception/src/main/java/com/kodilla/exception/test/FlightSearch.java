package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FlightSearch {
        Scanner scUserSearchDF = new Scanner(System.in);
    Scanner scUserSearchAF = new Scanner(System.in);

    void findFlight(Flight flight) {
        System.out.println("Please write name of the city for departure flight");
        String userSearchDF = scUserSearchDF.nextLine();
        System.out.println("Please write name of the city for arrival flight");
        String userSearchAF = scUserSearchAF.nextLine();
        HashMap<String, Boolean> flightMap = new HashMap<>();
        if ((userSearchDF.equalsIgnoreCase(flight.getDepartureAirport())) || (userSearchAF.equalsIgnoreCase(flight.getArrivalAirport()))) {
            System.out.println("Flight is possible");
        } else System.out.println("NO WAY!");
    }
}
