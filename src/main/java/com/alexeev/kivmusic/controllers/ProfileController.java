package com.alexeev.kivmusic.controllers;

import com.alexeev.kivmusic.models.ProfileEntity;
import com.alexeev.kivmusic.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<ProfileEntity> findAllProfile(){
        return profileService.findAllProfile();
    }

    @GetMapping("/{id}")
    public Optional<ProfileEntity> findProfileById(@PathVariable("id") Long id){
        return profileService.findById(id);
    }

    @GetMapping("/login/{profilelogin}")
    public ProfileEntity findProfileByProfilelogin(@PathVariable("profilelogin") String profilelogin){
        return profileService.findByProfilelogin(profilelogin);
    }

    @PostMapping
    public ProfileEntity saveProfile(@RequestBody ProfileEntity profile){
        return profileService.saveProfile(profile);
    }

    @PutMapping
    public ProfileEntity updateProfile(@RequestBody ProfileEntity profile){
        return profileService.updateProfile(profile);
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable("id") Long id){
        profileService.deleteProfile(id);
    }
}
