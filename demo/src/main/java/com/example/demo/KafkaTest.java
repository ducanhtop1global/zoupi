package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTest {
    @KafkaListener(id = "hehe", topics = "test")
    public void listen(String he) {
        System.out.println(he);
    }
}
