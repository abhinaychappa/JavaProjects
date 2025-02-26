package com.projects.ChatApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.chatapp")
public class AppConfig {
	
	@Bean
	
	public ChatController chatController() {
		return new ChatController(chatService());
	}

	@Bean
	public ChatService chatService() {
		return new ChatService();
	}

}
