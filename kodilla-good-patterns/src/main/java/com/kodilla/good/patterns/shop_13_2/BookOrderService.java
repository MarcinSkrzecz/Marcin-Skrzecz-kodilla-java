package com.kodilla.good.patterns.shop_13_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookOrderService implements OrderService{

    public boolean order(final User user, final LocalDateTime whenBought, LocalDate estimatedDelivery) {
        System.out.println("User: " + user.getName() + " " + user.getSurname() + " has successfully bought selected product/s. "
                + "\nOrder details had been send via SMS on phone number : " + user.getPhone() + " and on email: " + user.getEmail()
                + "\nProducts was send on adress: " + user.getAddress()
                + "\nDate of Order: " + whenBought.toString()
                + "\nEstimated delivery Date: " + estimatedDelivery.toString());
        return true;
    }
}
