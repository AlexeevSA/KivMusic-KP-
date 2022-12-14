package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.ProductEntity;
import com.alexeev.kivmusic.models.ProfileCardEntity;

import java.util.List;
import java.util.Optional;

public interface ProfileCardService {
    List<ProfileCardEntity> findAllProfileCard();
    Optional<ProfileCardEntity> findById(Long id);
    ProfileCardEntity saveProfileCard(ProfileCardEntity profileCard);
    ProfileCardEntity updateProfileCard(ProfileCardEntity profileCard);
    void deleteProfileCard(Long id);
}
