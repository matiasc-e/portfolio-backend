package com.portfolio.mti.services;

import com.portfolio.mti.models.Experience;
import com.portfolio.mti.repository.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienceService {

    private final ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceService(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    public Experience addExperience(Experience experience) {
        return experienceRepo.save(experience);
    }

    public List<Experience> getExperience () {
        return experienceRepo.findAll();
    }

    public Experience updateExperience(Experience experience) {
        return experienceRepo.save(experience);
    }

    public void deleteExperience(Long id) {
        experienceRepo.deleteById(id);
    }

}
