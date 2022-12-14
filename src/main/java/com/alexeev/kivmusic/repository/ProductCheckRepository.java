package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.ProductCheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCheckRepository extends JpaRepository<ProductCheckEntity, Long> {
}
