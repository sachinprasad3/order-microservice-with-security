package com.notification_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notification_service.dto.NotificationRequest;

@RestController
@RequestMapping("/api/v1/notification")
public class NotificationController {
	
	@PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestBody NotificationRequest request) {
        // For demo, we're just printing to console. Replace with actual email/SMS logic if needed.
        System.out.println("📢 Notification: " + request.getMessage());
        return ResponseEntity.ok("Notification sent to user ID: " + request.getUserId());
    }
	
}
