package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.ShopEntity;
import com.alexeev.kivmusic.repository.ShopRepository;
import com.alexeev.kivmusic.service.ShopService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    public ShopServiceImpl(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @Override
    public List<ShopEntity> findAllShop() {
        return shopRepository.findAll();
    }

    @Override
    public Optional<ShopEntity> findById(Long id) {
        return shopRepository.findById(id);
    }

    @Override
    public ShopEntity saveShop(ShopEntity shop) {
        return shopRepository.save(shop);
    }

    @Override
    public ShopEntity updateShop(ShopEntity shop) {
        return shopRepository.save(shop);
    }

    @Override
    public void deleteShop(Long id) {
        shopRepository.deleteById(id);
    }
}
