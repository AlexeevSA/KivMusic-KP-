package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.TypeCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCardRepository extends JpaRepository<TypeCardEntity, Long> {
}