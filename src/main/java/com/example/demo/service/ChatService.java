package com.example.demo.service;

import com.example.demo.model.ChatMessage;
import com.example.demo.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    public List<ChatMessage> getAllMessages() {
        return chatRepository.findAll();
    }

    public List<ChatMessage> getMessagesBySender(String sender) {
        return chatRepository.findBySender(sender);
    }

    public void saveMessage(ChatMessage message) {
        message.setTimestamp(LocalDateTime.now());
        chatRepository.save(message);
    }
}
