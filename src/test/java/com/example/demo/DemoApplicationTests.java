package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.EmployeeMapper;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    EmployeeController controller;


    @Test
    void testController(){
        Employee employee = controller.getEmployeeById(1);
        assertEquals("test name:", "alex",employee.getName());
        System.out.println("get employee =>"+ employee);
    }
}
