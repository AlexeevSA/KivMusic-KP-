package com.alexeev.kivmusic.repository;

import com.alexeev.kivmusic.models.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RolesEntity, Long> {
    RolesEntity findRolesEntitiesByRolename(String rolename);
}
