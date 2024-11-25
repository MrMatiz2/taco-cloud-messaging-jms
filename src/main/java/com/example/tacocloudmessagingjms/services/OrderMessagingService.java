package com.example.tacocloudmessagingjms.services;

import com.example.tacocloud.entities.TacoOrder;

public interface OrderMessagingService {

    void sendOrder(TacoOrder order);

}
