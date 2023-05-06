package com.portfolio.mti.controller;

import com.portfolio.mti.models.Education;
import com.portfolio.mti.services.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education")
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public ResponseEntity<List<Education>> getEducation () {
        List<Education> educations = educationService.getEducation();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Education> addEducation (@RequestBody  Education newEducation) {
        Education educationPosted = educationService.addEducation(newEducation);
        return new ResponseEntity<>(educationPosted, HttpStatus.CREATED);
    }

    @PutMapping
    public  ResponseEntity<Education> updateEducation (@RequestBody Education educationToUpdate) {
        Education educationUpdated = educationService.updateEducation(educationToUpdate);
        return new ResponseEntity<>(educationUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Education> deleteEducation(@PathVariable("id") Long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
