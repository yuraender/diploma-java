package com.example.demo.repository;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
        Optional<Department> findByIdAndDisabledFalseAndInstituteId(Long id, Long instituteId);
        List<Department> findAllByDisabledFalseAndInstituteId(Long instituteId);
        Optional<Department> findByCodeAndDisabledFalse(String code);
}