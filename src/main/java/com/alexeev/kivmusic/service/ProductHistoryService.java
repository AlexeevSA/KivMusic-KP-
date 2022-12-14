package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.ProductCheckEntity;
import com.alexeev.kivmusic.models.ProductHistoryEntity;

import java.util.List;
import java.util.Optional;

public interface ProductHistoryService {
    List<ProductHistoryEntity> findAllProductHistory();
    Optional<ProductHistoryEntity> findById(Long id);
    ProductHistoryEntity saveProductHistory(ProductHistoryEntity productHistory);
    ProductHistoryEntity updateProductHistory(ProductHistoryEntity productHistory);
    void deleteProductHistory(Long id);
}
