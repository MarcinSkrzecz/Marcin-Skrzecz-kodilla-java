package com.kodilla.good.patterns.shop_13_2;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new BookOrderService(), new BookOrderRepository());
        orderProcessor.process(orderRequest);
    }

}