package com.eddie.receiver.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmilyDataConsumer {
    @KafkaListener(topics = "emily_stuff", groupId = "101", id = "emily", autoStartup = "${listen.auto.start:false}")
    public void processMessage(List<Message<String>> content) {
        for (Message<String> message : content) {
            System.out.println("Received kafka message: " + message.getPayload());
        }
    }
}

