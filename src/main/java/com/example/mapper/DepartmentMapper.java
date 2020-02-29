package com.example.mapper;

import com.example.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Mapper
public interface DepartmentMapper {

    @Select("select * from tbl_department where id=#{id}")
    public Department getDepartmentById(@PathVariable Integer id);
}
