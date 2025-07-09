package com.payment_service.dto;

public class NotificationRequestDto {
	 private Long userId;
	 private String message;
	public NotificationRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NotificationRequestDto(Long userId, String message) {
		super();
		this.userId = userId;
		this.message = message;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	   
	 
}
