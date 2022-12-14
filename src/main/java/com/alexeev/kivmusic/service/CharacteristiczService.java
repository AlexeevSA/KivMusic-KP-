package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.CardEntity;
import com.alexeev.kivmusic.models.CharacteristiczEntity;

import java.util.List;
import java.util.Optional;

public interface CharacteristiczService {
    List<CharacteristiczEntity> findAllCharacteristicz();
    Optional<CharacteristiczEntity> findById(Long id);
    CharacteristiczEntity saveCharacteristicz(CharacteristiczEntity characteristicz);
    CharacteristiczEntity updateCharacteristicz(CharacteristiczEntity characteristicz);
    void deleteCharacteristicz(Long id);
}
