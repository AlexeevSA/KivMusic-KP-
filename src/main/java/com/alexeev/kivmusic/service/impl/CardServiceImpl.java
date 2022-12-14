package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.CardEntity;
import com.alexeev.kivmusic.repository.CardRepository;
import com.alexeev.kivmusic.service.CardService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public List<CardEntity> findAllCard() {
        return cardRepository.findAll();
    }

    @Override
    public Optional<CardEntity> findById(Long id) {
        return cardRepository.findById(id);
    }

    @Override
    public CardEntity saveCard(CardEntity card) {
        return cardRepository.save(card);
    }

    @Override
    public CardEntity updateCard(CardEntity card) {
        return cardRepository.save(card);
    }

    @Override
    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }
}
