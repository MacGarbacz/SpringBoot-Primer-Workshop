package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeJDBCRepository {

    @Autowired
    JdbcTemplate template;


    public List<Employee> findAll(){
        return template.query("Select * from Employee", new BeanPropertyRowMapper(Employee.class));

    }

}
