package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.DeliveryEntity;
import com.alexeev.kivmusic.models.LocationWarehouseEntity;

import java.util.List;
import java.util.Optional;

public interface LocationWarehouseService {
    List<LocationWarehouseEntity> findAllLocationWarehouse();
    Optional<LocationWarehouseEntity> findById(Long id);
    LocationWarehouseEntity saveLocationWarehouse(LocationWarehouseEntity locationWarehouse);
    LocationWarehouseEntity updateLocationWarehouse(LocationWarehouseEntity locationWarehouse);
    void deleteLocationWarehouse(Long id);
}
