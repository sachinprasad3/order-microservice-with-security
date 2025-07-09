package com.payment_service.servise;

import com.payment_service.entity.Payment;

public interface PaymentService {
	
	public Payment create(Payment payment);
	
	public Payment getById(long id);
	
	
}
