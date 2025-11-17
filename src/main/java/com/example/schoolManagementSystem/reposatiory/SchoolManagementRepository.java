package com.example.schoolManagementSystem.reposatiory;

import com.example.schoolManagementSystem.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolManagementRepository extends JpaRepository<School, Long> {
}
