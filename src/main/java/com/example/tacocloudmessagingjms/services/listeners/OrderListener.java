package com.example.tacocloudmessagingjms.services.listeners;

import com.example.tacoclouddomain.entities.TacoOrder;
import com.example.tacoclouddomain.kitchen.KitchenOrder;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//@Profile("jms-listener")
@Component
public class OrderListener {

    private final KitchenOrder kitchenOrder;

    public OrderListener(KitchenOrder kitchenOrder) {
        this.kitchenOrder = kitchenOrder;
    }

    @JmsListener(destination = "tacocloud.order.queue")
    public void receiveOrder(TacoOrder order) {
        kitchenOrder.displayOrder(order);
    }

}
