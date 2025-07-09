package com.payment_service.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private String paymentStatus;
    private String paymentMode;
    private LocalDateTime paymentDate;
    
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(Long id, Long orderId, String paymentStatus, String paymentMode, LocalDateTime paymentDate) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.paymentStatus = paymentStatus;
		this.paymentMode = paymentMode;
		this.paymentDate = paymentDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
    
    
}
