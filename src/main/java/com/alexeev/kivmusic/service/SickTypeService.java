package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.SickLeavEntity;
import com.alexeev.kivmusic.models.SickTypeEntity;

import java.util.List;
import java.util.Optional;

public interface SickTypeService {
    List<SickTypeEntity> findAllSickType();
    Optional<SickTypeEntity> findById(Long id);
    SickTypeEntity saveSickType(SickTypeEntity sickType);
    SickTypeEntity updateSickType(SickTypeEntity sickType);
    void deleteSickType(Long id);
}
