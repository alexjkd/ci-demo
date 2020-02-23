package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.EmployeeMapper;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    EmployeeController controller;

    @Test
    void contextLoads() {
    }

    @Test
    void testController(){
        Employee employee = controller.getEmployeeById(1);
        System.out.println("get employee =>"+ employee);
    }
}
