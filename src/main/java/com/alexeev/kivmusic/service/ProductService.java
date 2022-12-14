package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.ProductEntity;
import com.alexeev.kivmusic.models.ProductHistoryEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductEntity> findAllProduct();
    Optional<ProductEntity> findById(Long id);
    ProductEntity saveProduct(ProductEntity product);
    ProductEntity updateProduct(ProductEntity product);
    void deleteProduct(Long id);
}
