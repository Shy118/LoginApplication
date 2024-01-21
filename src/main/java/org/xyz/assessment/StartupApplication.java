package org.xyz.assessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.xyz.assessment.dao.EmployeeRepository;
import org.xyz.assessment.model.Employee;
import org.xyz.assessment.model.EmployeeRole;

@Component
public class StartupApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee member = new Employee("Raymond", "Welt", "user", "user", EmployeeRole.USER);
        Employee manager = new Employee("Kenny", "Reid", "manager", "manager", EmployeeRole.MANAGER);
        Employee memberMandarin = new Employee("俊豪", "李", "員工", "員工", EmployeeRole.USER);
        Employee managerMandarin = new Employee("榮耀", "陳", "經理", "經理", EmployeeRole.MANAGER);
        employeeRepository.save(member);
        employeeRepository.save(manager);
        employeeRepository.save(memberMandarin);
        employeeRepository.save(managerMandarin);
    }

}
