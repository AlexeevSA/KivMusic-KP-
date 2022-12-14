package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.ProductTypeEntity;
import com.alexeev.kivmusic.repository.ProductTypeRepository;
import com.alexeev.kivmusic.service.ProductTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    private final ProductTypeRepository productTypeRepository;

    public ProductTypeServiceImpl(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    @Override
    public List<ProductTypeEntity> findAllProductType() {
        return productTypeRepository.findAll();
    }

    @Override
    public Optional<ProductTypeEntity> findById(Long id) {
        return productTypeRepository.findById(id);
    }

    @Override
    public ProductTypeEntity saveProductType(ProductTypeEntity productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public ProductTypeEntity updateProductType(ProductTypeEntity productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public void deleteProductType(Long id) {
        productTypeRepository.deleteById(id);
    }
}
