package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.LocationWarehouseEntity;
import com.alexeev.kivmusic.models.PaymentSystemEntity;

import java.util.List;
import java.util.Optional;

public interface PaymentSystemService {
    List<PaymentSystemEntity> findAllPaymentSystem();
    Optional<PaymentSystemEntity> findById(Long id);
    PaymentSystemEntity savePaymentSystem(PaymentSystemEntity paymentSystem);
    PaymentSystemEntity updatePaymentSystem(PaymentSystemEntity paymentSystem);
    void deletePaymentSystem(Long id);
}
