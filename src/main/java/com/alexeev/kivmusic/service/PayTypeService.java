package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.PayTypeEntity;
import com.alexeev.kivmusic.models.PaymentSystemEntity;

import java.util.List;
import java.util.Optional;

public interface PayTypeService {
    List<PayTypeEntity> findAllPayType();
    Optional<PayTypeEntity> findById(Long id);
    PayTypeEntity savePayType(PayTypeEntity payType);
    PayTypeEntity updatePayType(PayTypeEntity payType);
    void deletePayType(Long id);
}
