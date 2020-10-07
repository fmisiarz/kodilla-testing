package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrdersService ordersService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrdersService ordersService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.ordersService = ordersService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = ordersService.order(orderRequest.getUser(), orderRequest.getOrderTime(),
                orderRequest.getReceiveTime(),orderRequest.getOrder());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getReceiveTime(),orderRequest.getOrder());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}