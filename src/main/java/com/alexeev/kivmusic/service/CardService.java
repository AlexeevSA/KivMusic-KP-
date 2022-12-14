package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.BankEntity;
import com.alexeev.kivmusic.models.CardEntity;

import java.util.List;
import java.util.Optional;

public interface CardService {
    List<CardEntity> findAllCard();
    Optional<CardEntity> findById(Long id);
    CardEntity saveCard(CardEntity card);
    CardEntity updateCard(CardEntity card);
    void deleteCard(Long id);
}
