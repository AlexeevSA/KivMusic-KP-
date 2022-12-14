package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.VacationTypeEntity;
import com.alexeev.kivmusic.models.WarehouseEntity;

import java.util.List;
import java.util.Optional;

public interface WarehouseService {
    List<WarehouseEntity> findAllWarehouse();
    Optional<WarehouseEntity> findById(Long id);
    WarehouseEntity saveWarehouse(WarehouseEntity warehouse);
    WarehouseEntity updateWarehouse(WarehouseEntity warehouse);
    void deleteWarehouse(Long id);
}
