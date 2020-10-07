package com.kodilla.good.patterns.challenges;

public class App {
    public static void main(String[] args) {
        //ZAD13.1
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .forEach(e -> System.out.print(e + " ! "));

        System.out.println("ZADANIE13.2\n");
    //ZAD13.2
OrderRequestRetriever orderRequestRetriever=new OrderRequestRetriever();
    OrderRequest orderRequest=orderRequestRetriever.retrieve();
    OrderProcessor orderProcessor=new OrderProcessor(new MailService(),new ProductOrdersService(),new OrderBaseRepo());
    orderProcessor.process(orderRequest);
}
}