package com.payment_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.payment_service.dto.NotificationRequestDto;

@FeignClient(name = "notification-service", path = "/api/v1/notification")
public interface NotificationClient {
	
	 @PostMapping("/send")
	 ResponseEntity<String> sendNotification(@RequestBody NotificationRequestDto request);
	 
}
