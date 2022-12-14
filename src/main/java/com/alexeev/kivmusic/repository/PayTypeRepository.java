package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.PayTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayTypeRepository extends JpaRepository<PayTypeEntity, Long> {
}
