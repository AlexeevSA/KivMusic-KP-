package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.ProductCharacteristiczEntity;
import com.alexeev.kivmusic.repository.ProductCharacteristiczRepository;
import com.alexeev.kivmusic.service.ProductCharacteristiczService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCharacteristiczServiceImpl implements ProductCharacteristiczService {

    private final ProductCharacteristiczRepository productCharacteristiczRepository;

    public ProductCharacteristiczServiceImpl(ProductCharacteristiczRepository productCharacteristiczRepository) {
        this.productCharacteristiczRepository = productCharacteristiczRepository;
    }

    @Override
    public List<ProductCharacteristiczEntity> findAllProductCharacteristicz() {
        return productCharacteristiczRepository.findAll();
    }

    @Override
    public Optional<ProductCharacteristiczEntity> findById(Long id) {
        return productCharacteristiczRepository.findById(id);
    }

    @Override
    public ProductCharacteristiczEntity saveProductCharacteristicz(ProductCharacteristiczEntity productCharacteristicz) {
        return productCharacteristiczRepository.save(productCharacteristicz);
    }

    @Override
    public ProductCharacteristiczEntity updateProductCharacteristicz(ProductCharacteristiczEntity productCharacteristicz) {
        return productCharacteristiczRepository.save(productCharacteristicz);
    }

    @Override
    public void deleteProductCharacteristicz(Long id) {
        productCharacteristiczRepository.deleteById(id);
    }
}
