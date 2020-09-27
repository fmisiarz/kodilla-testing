package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class OrderCreator {
    LocalDate OrderTime1=LocalDate.of(2020,9,24);
    LocalDate OrderTime2=LocalDate.of(2020,9,20);
    ConfirmationSms confirmationSms=new ConfirmationSms();
    ConfirmationMail confirmationMail=new ConfirmationMail();
    OrderClothes orderClothes=new OrderClothes(OrderTime1);
    OrderFurniture orderFurniture=new OrderFurniture(OrderTime2);
    User user1=new User("Filip");
    User user2=new User("Kasia");
    OrderRequest orderRequest1=new OrderRequest(OrderTime1,confirmationSms,orderClothes,user1);
    OrderRequest orderRequest2=new OrderRequest(OrderTime2,confirmationMail,orderFurniture,user2);


}
