package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.SickTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SickTypeRepository extends JpaRepository<SickTypeEntity, Long> {
}
