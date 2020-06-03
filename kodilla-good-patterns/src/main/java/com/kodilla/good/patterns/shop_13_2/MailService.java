package com.kodilla.good.patterns.shop_13_2;

public class MailService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("Order Confirmation email has been send");
    }
}
