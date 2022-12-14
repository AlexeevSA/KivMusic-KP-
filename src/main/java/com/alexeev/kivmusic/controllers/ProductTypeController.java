package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.ProductHistoryEntity;
import com.alexeev.kivmusic.models.ProductTypeEntity;
import com.alexeev.kivmusic.service.ProductTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producttype")
public class ProductTypeController {
    private final ProductTypeService productTypeService;

    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    @GetMapping
    public List<ProductTypeEntity> findAllProductType(){
        return productTypeService.findAllProductType();
    }

    @GetMapping("/{id}")
    public Optional<ProductTypeEntity> findProductTypeById(@PathVariable("id") Long id){
        return productTypeService.findById(id);
    }

    @PostMapping
    public ProductTypeEntity saveProductType(@RequestBody ProductTypeEntity productType){
        return productTypeService.saveProductType(productType);
    }

    @PutMapping
    public ProductTypeEntity updateProductType(@RequestBody ProductTypeEntity productType){
        return productTypeService.updateProductType(productType);
    }

    @DeleteMapping("/{id}")
    public void deleteProductType(@PathVariable("id") Long id){
        productTypeService.deleteProductType(id);
    }
}
