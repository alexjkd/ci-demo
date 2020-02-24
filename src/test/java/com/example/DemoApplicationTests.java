package com.example;

import com.example.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    EmployeeService employeeService;

    @Test
    void testController(){
        Employee employee = employeeService.getEmployeeById(1);
        assertEquals("test name:", "alex",employee.getName());
        System.out.println("get employee =>"+ employee);
    }
}
