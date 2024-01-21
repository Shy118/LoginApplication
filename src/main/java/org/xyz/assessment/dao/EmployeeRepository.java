package org.xyz.assessment.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.xyz.assessment.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
    public Optional<Employee> findByUserNameAndPassword(String userName, String password);
}
