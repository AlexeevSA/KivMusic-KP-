package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.ProductCharacteristiczEntity;
import com.alexeev.kivmusic.service.ProductCharacteristiczService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productcharacteristicz")
public class ProductCharacteristiczController {
    private final ProductCharacteristiczService productCharacteristiczService;

    public ProductCharacteristiczController(ProductCharacteristiczService productCharacteristiczService) {
        this.productCharacteristiczService = productCharacteristiczService;
    }

    @GetMapping
    public List<ProductCharacteristiczEntity> findAllProductCharacteristicz(){
        return productCharacteristiczService.findAllProductCharacteristicz();
    }

    @GetMapping("/{id}")
    public Optional<ProductCharacteristiczEntity> findProductCharacteristiczById(@PathVariable("id") Long id){
        return productCharacteristiczService.findById(id);
    }

    @PostMapping
    public ProductCharacteristiczEntity saveProductCharacteristicz(@RequestBody ProductCharacteristiczEntity productCharacteristicz){
        return productCharacteristiczService.saveProductCharacteristicz(productCharacteristicz);
    }

    @PutMapping
    public ProductCharacteristiczEntity updateProductCharacteristicz(@RequestBody ProductCharacteristiczEntity productCharacteristicz){
        return productCharacteristiczService.updateProductCharacteristicz(productCharacteristicz);
    }

    @DeleteMapping("/{id}")
    public void deleteProductCharacteristicz(@PathVariable("id") Long id){
        productCharacteristiczService.deleteProductCharacteristicz(id);
    }
}
