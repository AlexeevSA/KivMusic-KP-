package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.ConsumerCartEntity;
import com.alexeev.kivmusic.repository.ConsumerCartRepository;
import com.alexeev.kivmusic.service.ConsumerCartService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumerCartServiceImpl implements ConsumerCartService {

    private final ConsumerCartRepository consumerCartRepository;

    public ConsumerCartServiceImpl(ConsumerCartRepository consumerCartRepository) {
        this.consumerCartRepository = consumerCartRepository;
    }

    @Override
    public List<ConsumerCartEntity> findAllConsumerCart() {
        return consumerCartRepository.findAll();
    }

    @Override
    public Optional<ConsumerCartEntity> findById(Long id) {
        return consumerCartRepository.findById(id);
    }

    @Override
    public ConsumerCartEntity saveConsumerCart(ConsumerCartEntity consumerCart) {
        return consumerCartRepository.save(consumerCart);
    }

    @Override
    public ConsumerCartEntity updateConsumerCart(ConsumerCartEntity consumerCart) {
        return consumerCartRepository.save(consumerCart);
    }

    @Override
    public void deleteConsumerCart(Long id) {
        consumerCartRepository.deleteById(id);
    }
}
