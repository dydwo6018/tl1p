package com.sparta.tl3p.backend.domain.payment.repository;

import com.sparta.tl3p.backend.domain.payment.entity.Payment;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {

}
