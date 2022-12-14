package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.ProductCheckEntity;
import com.alexeev.kivmusic.repository.ProductCheckRepository;
import com.alexeev.kivmusic.service.ProductCheckService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCheckServiceImpl implements ProductCheckService {

    private final ProductCheckRepository productCheckRepository;

    public ProductCheckServiceImpl(ProductCheckRepository productCheckRepository) {
        this.productCheckRepository = productCheckRepository;
    }

    @Override
    public List<ProductCheckEntity> findAllProductCheck() {
        return productCheckRepository.findAll();
    }

    @Override
    public Optional<ProductCheckEntity> findById(Long id) {
        return productCheckRepository.findById(id);
    }

    @Override
    public ProductCheckEntity saveProductCheck(ProductCheckEntity productCheck) {
        return productCheckRepository.save(productCheck);
    }

    @Override
    public ProductCheckEntity updateProductCheck(ProductCheckEntity productCheck) {
        return productCheckRepository.save(productCheck);
    }

    @Override
    public void deleteProductCheck(Long id) {
        productCheckRepository.deleteById(id);
    }
}
