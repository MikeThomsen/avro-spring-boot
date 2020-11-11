package com.example.demo.controller;

import com.example.demo.MessageResponse;
import com.test.MessageRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    @GetMapping("test")
    public MessageResponse test() {
        MessageResponse response = new MessageResponse();
        response.setFrom("john.smith");
        response.setTo("jane.doe");
        response.setMessage("Hello, world");
        return response;
    }

    @GetMapping("test2")
    public MessageRecord test2() {
        return MessageRecord.newBuilder()
                .setFrom("jane.doe")
                .setTo("john.smith")
                .setMessage("Avro is awesomesauce!!")
                .build();
    }
}
