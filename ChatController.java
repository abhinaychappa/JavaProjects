package com.projects.ChatApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatController {
	
	private final ChatService chatService;

	@Autowired
	public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

	public void sendMessage(String message) {
		System.out.println("Sending message: " + message);
        chatService.processMessage(message);

	}

}
