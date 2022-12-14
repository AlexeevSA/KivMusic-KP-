package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.SickTypeEntity;
import com.alexeev.kivmusic.models.TypeCardEntity;

import java.util.List;
import java.util.Optional;

public interface TypeCardService {
    List<TypeCardEntity> findAllTypeCard();
    Optional<TypeCardEntity> findById(Long id);
    TypeCardEntity saveTypeCard(TypeCardEntity typeCard);
    TypeCardEntity updateTypeCard(TypeCardEntity typeCard);
    void deleteTypeCard(Long id);
}
