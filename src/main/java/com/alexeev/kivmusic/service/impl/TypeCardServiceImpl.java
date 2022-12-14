package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.TypeCardEntity;
import com.alexeev.kivmusic.repository.TypeCardRepository;
import com.alexeev.kivmusic.service.TypeCardService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeCardServiceImpl implements TypeCardService {

    private final TypeCardRepository typeCardRepository;

    public TypeCardServiceImpl(TypeCardRepository typeCardRepository) {
        this.typeCardRepository = typeCardRepository;
    }

    @Override
    public List<TypeCardEntity> findAllTypeCard() {
        return typeCardRepository.findAll();
    }

    @Override
    public Optional<TypeCardEntity> findById(Long id) {
        return typeCardRepository.findById(id);
    }

    @Override
    public TypeCardEntity saveTypeCard(TypeCardEntity typeCard) {
        return typeCardRepository.save(typeCard);
    }

    @Override
    public TypeCardEntity updateTypeCard(TypeCardEntity typeCard) {
        return typeCardRepository.save(typeCard);
    }

    @Override
    public void deleteTypeCard(Long id) {
        typeCardRepository.deleteById(id);
    }
}
