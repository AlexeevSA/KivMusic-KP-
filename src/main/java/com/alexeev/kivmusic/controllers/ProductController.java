package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.ProductEntity;
import com.alexeev.kivmusic.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductEntity> findAllProduct(){
        return productService.findAllProduct();
    }

    @GetMapping("/{id}")
    public Optional<ProductEntity> findProductById(@PathVariable("id") Long id){
        return productService.findById(id);
    }

    @PostMapping
    public ProductEntity saveProduct(@RequestBody ProductEntity product){
        return productService.saveProduct(product);
    }

    @PutMapping
    public ProductEntity updateProduct(@RequestBody ProductEntity product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }
}
