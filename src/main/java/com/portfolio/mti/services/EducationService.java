package com.portfolio.mti.services;

import com.portfolio.mti.models.Education;
import com.portfolio.mti.repository.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducationService {

    private final EducationRepo educationRepo;

    @Autowired
    public EducationService(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
    }

    public Education addEducation(Education education) {
        return educationRepo.save(education);
    }
    public List<Education> getEducation() {
        return educationRepo.findAll();
    }

    public Education updateEducation(Education newEducation) {
        return educationRepo.save(newEducation);
    }

    public void deleteEducation(Long id) {
        educationRepo.deleteById(id);
    }

}
