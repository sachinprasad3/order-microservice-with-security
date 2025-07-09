package com.payment_service.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment_service.entity.Payment;
import com.payment_service.repo.PaymentRepo;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentRepo paymentRepo;
	
	@Override
	public Payment create(Payment payment) {
		return paymentRepo.save(payment);
	}

	@Override
	public Payment getById(long id) {
		return paymentRepo.findById(id).orElseThrow(()-> new RuntimeException("payment not found with id : "+id));
	}

}
