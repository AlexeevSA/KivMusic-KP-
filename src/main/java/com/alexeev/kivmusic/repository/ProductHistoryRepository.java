package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.ProductHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductHistoryRepository extends JpaRepository<ProductHistoryEntity, Long> {
}
