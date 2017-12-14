package com.example;

import org.springframework.stereotype.Service;


/**
 * Created by ali on 14.12.2017.
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getMessage() {

        Message message = new Message();
        String greetingMessage = message.getGreetingMessage();
        return greetingMessage;
    }
}
