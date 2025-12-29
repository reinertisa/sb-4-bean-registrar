package com.reinertisa.probeans;

import java.time.LocalDateTime;

public class SmsMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "📲 SMS message sent at" + LocalDateTime.now();
    }

    @Override
    public String getServiceType() {
        return "SMS";
    }
}
