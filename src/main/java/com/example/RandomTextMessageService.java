package com.example;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Random;


@Component("randomMessageService")
public class RandomTextMessageService implements MessageService{

    private String[] randomMessage = {
            "Msg0", "Msg1", "Msg2", "Msg3", "Msg4",
            "Msg5", "Msg6", "Msg7", "Msg8", "Msg9",
    };

    @Override
    public String getMessage() {
        Random rn = new Random();
        return randomMessage[rn.nextInt(10)];
    }
}
