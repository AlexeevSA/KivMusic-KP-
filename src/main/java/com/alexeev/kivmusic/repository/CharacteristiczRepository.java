package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.CharacteristiczEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristiczRepository extends JpaRepository<CharacteristiczEntity, Long> {
}
