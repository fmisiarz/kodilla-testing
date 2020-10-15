package com.kodilla.good.patterns.challenges.FlyService;


import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        City warsaw=new City("Warsaw");
        City gdansk=new City("Gdansk");
        City wroclaw=new City("Wroclaw");
        City lublin=new City("Lublin");



        Flight WarsawToGdansk=new Flight(warsaw,gdansk);
        Flight WarsawToWroclaw=new Flight(warsaw,wroclaw);
        Flight WarsawToLublin=new Flight(warsaw,lublin);

        ArrayList<Flight>flights=new ArrayList<Flight>();
        flights.add(WarsawToGdansk);
        flights.add(WarsawToWroclaw);
        flights.add(WarsawToLublin);
        flights.stream().filter(n->n.getFrom().equals(warsaw)).forEach(s-> System.out.println("FLIGHT FROM WARSAW CAN FINISH TO: "+s.getTo()));
        flights.stream().filter(n->n.getTo().equals(wroclaw)).forEach(s-> System.out.println("FLIGHT TO WROCLAW CAN BEGIN FROM: "+s.getFrom()));

    }
}