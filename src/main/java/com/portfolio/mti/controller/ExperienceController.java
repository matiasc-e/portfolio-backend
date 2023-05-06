package com.portfolio.mti.controller;

import com.portfolio.mti.models.Experience;
import com.portfolio.mti.services.ExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

    private final ExperienceService experienceService;


    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public ResponseEntity<List<Experience>> getExperience() {
        List<Experience> educations = experienceService.getExperience();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Experience> addExperience(@RequestBody Experience newExperience) {
        Experience experience = experienceService.addExperience(newExperience);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id) {
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experienceToUpdate) {
        Experience updatedExperience = experienceService.updateExperience(experienceToUpdate);
        return new ResponseEntity<>(updatedExperience, HttpStatus.OK);
    }


}
