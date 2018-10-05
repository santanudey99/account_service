package com.sant.account.mq;

import org.springframework.stereotype.Component;

@Component
public class AccountMQReceiver {

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
