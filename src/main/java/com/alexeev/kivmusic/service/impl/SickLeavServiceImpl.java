package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.SickLeavEntity;
import com.alexeev.kivmusic.repository.SickLeavRepository;
import com.alexeev.kivmusic.service.SickLeavService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SickLeavServiceImpl implements SickLeavService {

    private final SickLeavRepository sickLeavRepository;

    public SickLeavServiceImpl(SickLeavRepository sickLeavRepository) {
        this.sickLeavRepository = sickLeavRepository;
    }

    @Override
    public List<SickLeavEntity> findAllSickLeav() {
        return sickLeavRepository.findAll();
    }

    @Override
    public Optional<SickLeavEntity> findById(Long id) {
        return sickLeavRepository.findById(id);
    }

    @Override
    public SickLeavEntity saveSickLeav(SickLeavEntity sickLeav) {
        return sickLeavRepository.save(sickLeav);
    }

    @Override
    public SickLeavEntity updateSickLeav(SickLeavEntity sickLeav) {
        return sickLeavRepository.save(sickLeav);
    }

    @Override
    public void deleteSickLeav(Long id) {
        sickLeavRepository.deleteById(id);
    }
}
