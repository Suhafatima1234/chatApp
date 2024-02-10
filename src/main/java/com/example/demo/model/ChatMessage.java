package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//ChatMessage.java
@Entity
public class ChatMessage {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String sender;
 private String content;
 private LocalDateTime timestamp;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public LocalDateTime getTimestamp() {
	return timestamp;
}
public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}

 // getters and setters
 
}
