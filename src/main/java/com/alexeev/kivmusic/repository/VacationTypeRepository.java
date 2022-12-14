package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.VacationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationTypeRepository extends JpaRepository<VacationTypeEntity, Long> {
}
