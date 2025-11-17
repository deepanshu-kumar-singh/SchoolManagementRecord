package com.example.schoolManagementSystem.service;

import com.example.schoolManagementSystem.model.School;
import com.example.schoolManagementSystem.reposatiory.SchoolManagementRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolManagementService {

    private final SchoolManagementRepository schoolManagementRepository;

    public SchoolManagementService(SchoolManagementRepository schoolManagementRepository) {
        this.schoolManagementRepository = schoolManagementRepository;
    }

    public School saveSchoolDetails(School school) {
        return schoolManagementRepository.save(school);
    }

    public Optional<School> getSchoolDetails(School school) {
        return schoolManagementRepository.findById(school.getId());
    }
}
