package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.SickLeavEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SickLeavRepository extends JpaRepository<SickLeavEntity, Long> {
}
