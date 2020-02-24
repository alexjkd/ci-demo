package com.example;

import org.springframework.stereotype.Component;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private Float salary;
    private Integer fk_department_id;

//    public Employee(Integer id, String name, Integer age, Float salary, Integer fk_department_id) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.fk_department_id = fk_department_id;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", fk_department_id=" + fk_department_id +
                '}';
    }

    public Employee() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Integer getFk_department_id() {
        return fk_department_id;
    }

    public void setFk_department_id(Integer fk_department_id) {
        this.fk_department_id = fk_department_id;
    }
}
