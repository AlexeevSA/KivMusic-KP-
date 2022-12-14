package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.WarehouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<WarehouseEntity, Long> {
}
