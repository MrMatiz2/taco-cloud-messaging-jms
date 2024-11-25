package com.example.tacocloudmessagingjms.services;

import com.example.tacocloudmessagingjms.entities.TacoOrder;

public interface OrderMessagingService {

    void sendOrder(TacoOrder order);

}
