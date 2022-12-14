package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.VacationEntity;
import com.alexeev.kivmusic.repository.VacationRepository;
import com.alexeev.kivmusic.service.VacationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacationServiceImpl implements VacationService {

    private final VacationRepository vacationRepository;

    public VacationServiceImpl(VacationRepository vacationRepository) {
        this.vacationRepository = vacationRepository;
    }

    @Override
    public List<VacationEntity> findAllVacation() {
        return vacationRepository.findAll();
    }

    @Override
    public Optional<VacationEntity> findById(Long id) {
        return vacationRepository.findById(id);
    }

    @Override
    public VacationEntity saveVacation(VacationEntity vacation) {
        return vacationRepository.save(vacation);
    }

    @Override
    public VacationEntity updateVacation(VacationEntity vacation) {
        return vacationRepository.save(vacation);
    }

    @Override
    public void deleteVacation(Long id) {
        vacationRepository.deleteById(id);
    }
}
