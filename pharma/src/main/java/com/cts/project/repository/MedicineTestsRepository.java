package com.cts.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.project.model.MedicalTests;

@Repository
public interface MedicineTestsRepository extends JpaRepository<MedicalTests, Integer>{

}
