package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.CharacteristiczEntity;
import com.alexeev.kivmusic.models.ConsumerCartEntity;

import java.util.List;
import java.util.Optional;

public interface ConsumerCartService {
    List<ConsumerCartEntity> findAllConsumerCart();
    Optional<ConsumerCartEntity> findById(Long id);
    ConsumerCartEntity saveConsumerCart(ConsumerCartEntity consumerCart);
    ConsumerCartEntity updateConsumerCart(ConsumerCartEntity consumerCart);
    void deleteConsumerCart(Long id);
}
