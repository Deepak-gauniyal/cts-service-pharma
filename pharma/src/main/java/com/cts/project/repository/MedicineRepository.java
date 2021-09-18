package com.cts.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.project.model.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, String> {

}
