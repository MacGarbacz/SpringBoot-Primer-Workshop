package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    EmployeeJDBCRepository repository;

    @RequestMapping("/employees")
    public List<Employee> employees(){
        return repository.findAll();
    }
}
