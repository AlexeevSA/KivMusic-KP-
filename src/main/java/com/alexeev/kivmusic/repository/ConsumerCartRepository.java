package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.ConsumerCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerCartRepository extends JpaRepository<ConsumerCartEntity, Long> {
}
