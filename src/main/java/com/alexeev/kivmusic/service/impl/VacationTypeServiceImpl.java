package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.VacationTypeEntity;
import com.alexeev.kivmusic.repository.VacationTypeRepository;
import com.alexeev.kivmusic.service.VacationTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacationTypeServiceImpl implements VacationTypeService {

    private final VacationTypeRepository vacationTypeRepository;

    public VacationTypeServiceImpl(VacationTypeRepository vacationTypeRepository) {
        this.vacationTypeRepository = vacationTypeRepository;
    }

    @Override
    public List<VacationTypeEntity> findAllVacationType() {
        return vacationTypeRepository.findAll();
    }

    @Override
    public Optional<VacationTypeEntity> findById(Long id) {
        return vacationTypeRepository.findById(id);
    }

    @Override
    public VacationTypeEntity saveVacationType(VacationTypeEntity vacationType) {
        return vacationTypeRepository.save(vacationType);
    }

    @Override
    public VacationTypeEntity updateVacationType(VacationTypeEntity vacationType) {
        return vacationTypeRepository.save(vacationType);
    }

    @Override
    public void deleteVacationType(Long id) {
        vacationTypeRepository.deleteById(id);
    }
}
