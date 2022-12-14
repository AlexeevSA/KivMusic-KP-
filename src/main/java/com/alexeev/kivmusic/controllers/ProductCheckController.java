package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.ProductCheckEntity;
import com.alexeev.kivmusic.service.ProductCheckService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productcheck")
public class ProductCheckController {
    private final ProductCheckService productCheckService;

    public ProductCheckController(ProductCheckService productCheckService) {
        this.productCheckService = productCheckService;
    }

    @GetMapping
    public List<ProductCheckEntity> findAllProductCheck(){
        return productCheckService.findAllProductCheck();
    }

    @GetMapping("/{id}")
    public Optional<ProductCheckEntity> findProductCheckById(@PathVariable("id") Long id){
        return productCheckService.findById(id);
    }

    @PostMapping
    public ProductCheckEntity saveProductCheck(@RequestBody ProductCheckEntity productCheck){
        return productCheckService.saveProductCheck(productCheck);
    }

    @PutMapping
    public ProductCheckEntity updateProductCheck(@RequestBody ProductCheckEntity productCheck){
        return productCheckService.updateProductCheck(productCheck);
    }

    @DeleteMapping("/{id}")
    public void deleteProductCheck(@PathVariable("id") Long id){
        productCheckService.deleteProductCheck(id);
    }
}
