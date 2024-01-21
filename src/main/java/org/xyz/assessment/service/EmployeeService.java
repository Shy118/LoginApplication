package org.xyz.assessment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xyz.assessment.dao.EmployeeRepository;
import org.xyz.assessment.model.Employee;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService() {
    }

    public Employee login(String userName, String password) {
        Optional<Employee> employeeEntity = employeeRepository.findByUserNameAndPassword(userName, password);
        if (employeeEntity.isPresent()) {
            Employee employee = employeeEntity.get();
            // Setting password as empty String prevent user's password sending back to UI
            employee.setPassword("");
            return employee;
        } else {
            return null;
        }
    }

    public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
