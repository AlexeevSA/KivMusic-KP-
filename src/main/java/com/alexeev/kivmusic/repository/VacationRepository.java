package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.VacationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationRepository extends JpaRepository<VacationEntity, Long> {
}
