package com.example.tacocloudmessagingjms.services.receivers;

import com.example.tacoclouddomain.entities.TacoOrder;

public interface OrderReceiver {
    TacoOrder receiveOrder();
}
