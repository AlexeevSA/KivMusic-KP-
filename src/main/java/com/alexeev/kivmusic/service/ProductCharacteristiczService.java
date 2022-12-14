package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.PayTypeEntity;
import com.alexeev.kivmusic.models.ProductCharacteristiczEntity;

import java.util.List;
import java.util.Optional;

public interface ProductCharacteristiczService {
    List<ProductCharacteristiczEntity> findAllProductCharacteristicz();
    Optional<ProductCharacteristiczEntity> findById(Long id);
    ProductCharacteristiczEntity saveProductCharacteristicz(ProductCharacteristiczEntity productCharacteristicz);
    ProductCharacteristiczEntity updateProductCharacteristicz(ProductCharacteristiczEntity productCharacteristicz);
    void deleteProductCharacteristicz(Long id);
}
