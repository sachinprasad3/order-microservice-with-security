package com.payment_service.util;

public class ApiResponse2<T> {
	private Boolean error;
	private String message;
	private T data;
	public ApiResponse2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiResponse2(Boolean error, String message, T data) {
		super();
		this.error = error;
		this.message = message;
		this.data = data;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	
}
