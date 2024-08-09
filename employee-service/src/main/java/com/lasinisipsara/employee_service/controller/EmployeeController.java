package com.lasinisipsara.employee_service.controller;

import com.lasinisipsara.employee_service.model.Employee;
import com.lasinisipsara.employee_service.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")


public class EmployeeController {
    private static final Logger LOGGER= LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeRepository repository;
    @PostMapping
    public Employee add(@RequestBody Employee employee){
        LOGGER.info("Employee added: {}",employee);
      return repository.add(employee);
    }

    @GetMapping
    public List<Employee> findAll(){
        LOGGER.info("All employees find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        LOGGER.info("Find employee by id: {}",id);
        return repository.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable Long departmentId){
        LOGGER.info("find employees by department");
        return repository.findByDepartment(departmentId);

    }


}
