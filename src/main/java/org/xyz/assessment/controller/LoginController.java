package org.xyz.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.xyz.assessment.model.Employee;
import org.xyz.assessment.service.EmployeeService;

@RestController
@CrossOrigin
public class LoginController {
    
    @Autowired
    private EmployeeService employeeService;

    public LoginController() {
    }

    @PostMapping(path = "v1/login")
    public ResponseEntity<Employee> login(@RequestBody Employee employee) {
        Employee employeeEntity = employeeService.login(employee.getUserName(), employee.getPassword());
        return employeeEntity != null ? new ResponseEntity<>(employeeEntity,HttpStatus.OK) : new ResponseEntity<>(employeeEntity,HttpStatus.UNAUTHORIZED);
    }

}
