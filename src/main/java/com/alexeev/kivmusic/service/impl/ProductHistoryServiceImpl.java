package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.ProductHistoryEntity;
import com.alexeev.kivmusic.repository.ProductHistoryRepository;
import com.alexeev.kivmusic.service.ProductHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductHistoryServiceImpl implements ProductHistoryService {

    private final ProductHistoryRepository productHistoryRepository;

    public ProductHistoryServiceImpl(ProductHistoryRepository productHistoryRepository) {
        this.productHistoryRepository = productHistoryRepository;
    }

    @Override
    public List<ProductHistoryEntity> findAllProductHistory() {
        return productHistoryRepository.findAll();
    }

    @Override
    public Optional<ProductHistoryEntity> findById(Long id) {
        return productHistoryRepository.findById(id);
    }

    @Override
    public ProductHistoryEntity saveProductHistory(ProductHistoryEntity productHistory) {
        return productHistoryRepository.save(productHistory);
    }

    @Override
    public ProductHistoryEntity updateProductHistory(ProductHistoryEntity productHistory) {
        return productHistoryRepository.save(productHistory);
    }

    @Override
    public void deleteProductHistory(Long id) {
        productHistoryRepository.deleteById(id);
    }
}
