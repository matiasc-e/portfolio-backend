package com.portfolio.mti.controller;

import com.portfolio.mti.models.Skills;
import com.portfolio.mti.services.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping
    public ResponseEntity<List<Skills>> getSkills () {
        List<Skills> skills = skillsService.getSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Skills> addSkills (@RequestBody Skills newSkill) {
        Skills skills = skillsService.addSkills(newSkill);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Skills> updateSkill (@RequestBody Skills skillToUpdate) {
        Skills updatedSkills = skillsService.updateSkills(skillToUpdate);
        return new ResponseEntity<>(updatedSkills, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkill (@PathVariable("id") Long id) {
        skillsService.deleteSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}