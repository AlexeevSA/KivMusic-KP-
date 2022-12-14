package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.LocationWarehouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationWarehouseRepository extends JpaRepository<LocationWarehouseEntity, Long> {
}
