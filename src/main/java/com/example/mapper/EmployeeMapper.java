package com.example.mapper;

import com.example.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    @Select("select * from tbl_employee where id=#{id}")
    public Employee getEmployeeById(Integer id);

}
