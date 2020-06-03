package com.kodilla.good.patterns.shop_13_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    protected OrderRequest retrieve() {
        User user = new User("Marcin","Skrzecz","123@o2.pl","Gdzieś Daleko","123456789");
        LocalDateTime whenBought = LocalDateTime.of(2020, 5,29,15,30,12);
        LocalDate estimatedDelivery = LocalDate.of(2020, 5,1);

        return new OrderRequest(user,whenBought,estimatedDelivery);

    }
}
