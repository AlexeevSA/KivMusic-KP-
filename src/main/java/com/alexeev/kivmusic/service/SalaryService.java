package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.RolesEntity;
import com.alexeev.kivmusic.models.SalaryEntity;

import java.util.List;
import java.util.Optional;

public interface SalaryService {
    List<SalaryEntity> findAllSalary();
    Optional<SalaryEntity> findById(Long id);
    SalaryEntity saveSalary(SalaryEntity salary);
    SalaryEntity updateSalary(SalaryEntity salary);
    void deleteSalary(Long id);
}
