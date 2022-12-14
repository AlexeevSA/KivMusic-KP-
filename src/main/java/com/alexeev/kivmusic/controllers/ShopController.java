package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.ShopEntity;
import com.alexeev.kivmusic.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shop")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<ShopEntity> findAllShop(){
        return shopService.findAllShop();
    }

    @GetMapping("/{id}")
    public Optional<ShopEntity> findShopById(@PathVariable("id") Long id){
        return shopService.findById(id);
    }

    @PostMapping
    public ShopEntity saveShop(@RequestBody ShopEntity shop){
        return shopService.saveShop(shop);
    }

    @PutMapping
    public ShopEntity updateShop(@RequestBody ShopEntity shop){
        return shopService.updateShop(shop);
    }

    @DeleteMapping("/{id}")
    public void deleteShop(@PathVariable("id") Long id){
        shopService.deleteShop(id);
    }
}
