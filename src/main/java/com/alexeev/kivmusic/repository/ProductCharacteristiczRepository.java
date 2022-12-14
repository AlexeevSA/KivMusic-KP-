package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.ProductCharacteristiczEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCharacteristiczRepository extends JpaRepository<ProductCharacteristiczEntity, Long> {
}
