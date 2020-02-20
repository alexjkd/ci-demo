package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    @Select("select * from t_employee where id=#{id}")
    public Employee getEmployeeById(Integer id);

}
