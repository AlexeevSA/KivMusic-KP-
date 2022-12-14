package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.ProfileCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileCardRepository extends JpaRepository<ProfileCardEntity, Long> {
}
