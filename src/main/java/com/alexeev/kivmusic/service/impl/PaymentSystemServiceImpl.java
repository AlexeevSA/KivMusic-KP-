package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.PaymentSystemEntity;
import com.alexeev.kivmusic.repository.PaymentSystemRepository;
import com.alexeev.kivmusic.service.PaymentSystemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentSystemServiceImpl implements PaymentSystemService {

    private final PaymentSystemRepository paymentSystemRepository;

    public PaymentSystemServiceImpl(PaymentSystemRepository paymentSystemRepository) {
        this.paymentSystemRepository = paymentSystemRepository;
    }

    @Override
    public List<PaymentSystemEntity> findAllPaymentSystem() {
        return paymentSystemRepository.findAll();
    }

    @Override
    public Optional<PaymentSystemEntity> findById(Long id) {
        return paymentSystemRepository.findById(id);
    }

    @Override
    public PaymentSystemEntity savePaymentSystem(PaymentSystemEntity paymentSystem) {
        return paymentSystemRepository.save(paymentSystem);
    }

    @Override
    public PaymentSystemEntity updatePaymentSystem(PaymentSystemEntity paymentSystem) {
        return paymentSystemRepository.save(paymentSystem);
    }

    @Override
    public void deletePaymentSystem(Long id) {
        paymentSystemRepository.deleteById(id);
    }
}
