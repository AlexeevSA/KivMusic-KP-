package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.TypeCardEntity;
import com.alexeev.kivmusic.models.VacationEntity;

import java.util.List;
import java.util.Optional;

public interface VacationService {
    List<VacationEntity> findAllVacation();
    Optional<VacationEntity> findById(Long id);
    VacationEntity saveVacation(VacationEntity vacation);
    VacationEntity updateVacation(VacationEntity vacation);
    void deleteVacation(Long id);
}
