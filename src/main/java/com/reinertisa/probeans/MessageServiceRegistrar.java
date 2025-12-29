package com.reinertisa.probeans;

import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

public class MessageServiceRegistrar implements BeanRegistrar {
    @Override
    public void register(BeanRegistry registry, Environment env) {
        String messageType = env.getProperty("app.message-type", "email");

        switch(messageType.toLowerCase()) {
            case "email" -> registry.registerBean("messageService", EmailMessageService.class,
                    spec -> spec.description("Email Message service registered visa the BeanRegistrar"));
            case "sms" -> registry.registerBean("smsService", SmsMessageService.class,
                    spec -> spec.description("SMS Message service registered visa the BeanRegistrar"));
            default -> throw new IllegalArgumentException("Unknown message type " + messageType);
        }
    }
}
