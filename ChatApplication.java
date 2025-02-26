package com.projects.ChatApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChatApplication {
	
	public static void main(String[]args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		ChatController controller = context.getBean(ChatController.class);
		
		controller.sendMessage("Hello, how are you?");
        controller.sendMessage("I am good, thanks!");
        controller.sendMessage("What about you?");
    }
	}


