package com.example.tacocloudmessagingjms.services;

import com.example.tacoclouddomain.entities.TacoOrder;

public interface OrderMessagingService {

    void sendOrder(TacoOrder order);

}
