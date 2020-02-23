package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/")
    public String getMsg() {
        return "this is a test";
    }

    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
       return employeeMapper.getEmployeeById(id);
    }
}
