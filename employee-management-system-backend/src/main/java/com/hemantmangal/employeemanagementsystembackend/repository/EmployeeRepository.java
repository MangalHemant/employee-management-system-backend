package com.hemantmangal.employeemanagementsystembackend.repository;

import com.hemantmangal.employeemanagementsystembackend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
