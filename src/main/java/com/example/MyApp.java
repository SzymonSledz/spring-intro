package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageServiceConfig.class);

        MessageService messageService = applicationContext.getBean(RandomTextMessageService.class);
        MessageService messageService1 = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(messageService1.hashCode());

    }
}
