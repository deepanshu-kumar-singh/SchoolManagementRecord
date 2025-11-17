package com.example.schoolManagementSystem.controller;

import com.example.schoolManagementSystem.model.School;
import com.example.schoolManagementSystem.service.SchoolManagementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/school")
public class SchoolManagementController {

    private final SchoolManagementService schoolManagementService;

    public SchoolManagementController(SchoolManagementService schoolManagementService){
        this.schoolManagementService = schoolManagementService;
    }

    @PostMapping("/saveSchoolDetails")
    public ResponseEntity<School> saveSchoolDetails(@RequestBody School school){
        School savedSchoolDetails = schoolManagementService.saveSchoolDetails(school);
        return ResponseEntity.accepted().body(savedSchoolDetails);
    }

    @GetMapping("/getSchoolDetails")
    public ResponseEntity<Optional<School>> getSchoolDetails(@RequestBody School school){
        Optional<School> savedSchoolDetails = schoolManagementService.getSchoolDetails(school);
        return ResponseEntity.accepted().body(savedSchoolDetails);
    }

}
