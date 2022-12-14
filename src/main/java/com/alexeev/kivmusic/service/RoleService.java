package com.alexeev.kivmusic.service;

import com.alexeev.kivmusic.models.ProfileEntity;
import com.alexeev.kivmusic.models.ProviderEntity;
import com.alexeev.kivmusic.models.RolesEntity;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<RolesEntity> findAllRoles();
    Optional<RolesEntity> findById(Long id);
    RolesEntity findByRolename(String rolename);
    RolesEntity saveRoles(RolesEntity roles);
    RolesEntity updateRoles(RolesEntity roles);
    void deleteRoles(Long id);
}
