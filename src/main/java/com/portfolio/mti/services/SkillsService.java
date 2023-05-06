package com.portfolio.mti.services;

import com.portfolio.mti.models.Skills;
import com.portfolio.mti.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkills(Skills skill) {
        return skillsRepo.save(skill);
    }

    public List<Skills> getSkills () {
        return skillsRepo.findAll();
    }

    public Skills updateSkills(Skills skill) {
        return skillsRepo.save(skill);
    }

    public void deleteSkills(Long id) {
        skillsRepo.deleteById(id);
    }
}
