package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ChatMessage;

import java.util.*;
//ChatRepository.java
public interface ChatRepository extends JpaRepository<ChatMessage, Long> {
 List<ChatMessage> findBySender(String sender);
}
