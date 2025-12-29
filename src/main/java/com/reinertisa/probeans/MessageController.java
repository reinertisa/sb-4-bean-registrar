package com.reinertisa.probeans;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public MessageResponse sendMessage() {
        return new MessageResponse(
                messageService.getMessage(),
                messageService.getServiceType()
        );
    }

    public record MessageResponse(String message, String serviceType) {}
}
