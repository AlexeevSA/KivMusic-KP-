package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.ProductCharacteristiczEntity;
import com.alexeev.kivmusic.models.ProductCheckEntity;

import java.util.List;
import java.util.Optional;

public interface ProductCheckService {
    List<ProductCheckEntity> findAllProductCheck();
    Optional<ProductCheckEntity> findById(Long id);
    ProductCheckEntity saveProductCheck(ProductCheckEntity productCheck);
    ProductCheckEntity updateProductCheck(ProductCheckEntity productCheck);
    void deleteProductCheck(Long id);
}
