package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.EmployeeRepo;

import java.util.List;


@Service
public class TestService {

    @Autowired
    private EmployeeRepo employeeRepo;


    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }


    List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }


    Employee findByEmployeeId(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(()
                -> new UserNotFoundException("User id" + id + "was not found"));
    }


}
