package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<ShopEntity, Long> {
}
