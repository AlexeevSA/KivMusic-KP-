package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.SalaryEntity;
import com.alexeev.kivmusic.models.ShopEntity;

import java.util.List;
import java.util.Optional;

public interface ShopService {
    List<ShopEntity> findAllShop();
    Optional<ShopEntity> findById(Long id);
    ShopEntity saveShop(ShopEntity shop);
    ShopEntity updateShop(ShopEntity shop);
    void deleteShop(Long id);
}
