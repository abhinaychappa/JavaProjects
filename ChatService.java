package com.projects.ChatApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class ChatService {
	private final ExecutorService executorService;
	
	@Autowired
	public ChatService() {
        // Using a thread pool to handle multiple messages in parallel
        this.executorService = Executors.newFixedThreadPool(2);
    }

	public void processMessage(String message) {
        executorService.submit(() -> {
            try {
                // Simulating message processing with a delay
                System.out.println("Processing message: " + message + " - Thread: " + Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("Message processed: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }

}
