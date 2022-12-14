package com.alexeev.kivmusic.service;


import com.alexeev.kivmusic.models.ProductTypeEntity;

import java.util.List;
import java.util.Optional;

public interface ProductTypeService {
    List<ProductTypeEntity> findAllProductType();
    Optional<ProductTypeEntity> findById(Long id);
    ProductTypeEntity saveProductType(ProductTypeEntity productType);
    ProductTypeEntity updateProductType(ProductTypeEntity productType);
    void deleteProductType(Long id);
}
