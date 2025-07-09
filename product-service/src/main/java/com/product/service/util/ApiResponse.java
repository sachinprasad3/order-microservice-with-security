package com.product.service.util;

public class ApiResponse {
	
	private Boolean error;
	private String message;
	private Object data;
	
	
	
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ApiResponse(Boolean error, String message, Object data) {
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
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	
}
