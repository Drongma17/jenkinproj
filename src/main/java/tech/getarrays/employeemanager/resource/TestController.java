package tech.getarrays.employeemanager.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.service.TestService;

@RestController
@RequestMapping("/test_app")
public class TestController {

    @Autowired
    TestService testService;


    @PostMapping("/add")
   ResponseEntity<Employee> saveEmp(Employee employee){
      Employee emp= testService.saveEmployee(employee);
       return new ResponseEntity<>(emp, HttpStatus.CREATED);
   }



}
