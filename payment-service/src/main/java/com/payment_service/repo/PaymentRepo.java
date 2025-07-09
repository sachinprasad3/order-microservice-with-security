package com.payment_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment_service.entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
