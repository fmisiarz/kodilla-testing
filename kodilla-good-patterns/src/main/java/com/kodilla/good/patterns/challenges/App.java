package com.kodilla.good.patterns.challenges;

public class App {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream().flatMap(e -> e.getValue().stream()).forEach(e -> System.out.print(e + " ! "));
    }
    }
