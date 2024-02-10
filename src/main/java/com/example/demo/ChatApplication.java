package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import com.google.cloud.spring.autoconfigure.pubsub.GcpPubSubAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {GcpPubSubAutoConfiguration.class})
public class ChatApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ChatApplication.class, args);
    }
}

