package com.alexeev.kivmusic.service.impl;

import com.alexeev.kivmusic.models.ProfileEntity;
import com.alexeev.kivmusic.repository.ProfileRepository;
import com.alexeev.kivmusic.service.ProfileService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public List<ProfileEntity> findAllProfile() {
        return profileRepository.findAll();
    }

    @Override
    public Optional<ProfileEntity> findById(Long id) {
        return profileRepository.findById(id);
    }

    @Override
    public ProfileEntity findByProfilelogin(String profilelogin) {
        return profileRepository.findByProfilelogin(profilelogin);
    }

    @Override
    public ProfileEntity saveProfile(ProfileEntity profile) {
        return profileRepository.save(profile);
    }

    @Override
    public ProfileEntity updateProfile(ProfileEntity profile) {
        return profileRepository.save(profile);
    }

    @Override
    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}
