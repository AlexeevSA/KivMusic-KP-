package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.ProductHistoryEntity;
import com.alexeev.kivmusic.service.ProductHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producthistory")
public class ProductHistoryController {
    private final ProductHistoryService productHistoryService;

    public ProductHistoryController(ProductHistoryService productHistoryService) {
        this.productHistoryService = productHistoryService;
    }

    @GetMapping
    public List<ProductHistoryEntity> findAllProductHistory(){
        return productHistoryService.findAllProductHistory();
    }

    @GetMapping("/{id}")
    public Optional<ProductHistoryEntity> findProductHistoryById(@PathVariable("id") Long id){
        return productHistoryService.findById(id);
    }

    @PostMapping
    public ProductHistoryEntity saveProductHistory(@RequestBody ProductHistoryEntity productHistory){
        return productHistoryService.saveProductHistory(productHistory);
    }

    @PutMapping
    public ProductHistoryEntity updateProductHistory(@RequestBody ProductHistoryEntity productHistory){
        return productHistoryService.updateProductHistory(productHistory);
    }

    @DeleteMapping("/{id}")
    public void deleteProductHistory(@PathVariable("id") Long id){
        productHistoryService.deleteProductHistory(id);
    }
}
