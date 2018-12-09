package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


@RestController
public class DemoController {

    public Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    EmployeeJDBCRepository repository;

    @RequestMapping("/employees")
    public List<Employee> employees(){
        return repository.findAll();
    }

    @Scheduled(fixedRate = 5000)
    public void logTime(){
        LOGGER.info(LocalDateTime.now().toString());
    }
}
