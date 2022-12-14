package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.PaymentSystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentSystemRepository extends JpaRepository<PaymentSystemEntity, Long> {
}