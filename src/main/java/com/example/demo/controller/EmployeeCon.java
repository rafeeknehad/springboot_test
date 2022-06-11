package com.example.demo.controller;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeCon {

    @Autowired
    EmployeeRepo employeeRepo;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<EmployeeEntity> getEmp() {
        System.out.println("e7na hena");
        return employeeRepo.findAll();

    }

    @RequestMapping(path = "/join",method = RequestMethod.GET)
    public List<EmployeeEntity> getData(){
        System.out.println("e7na hena 1");
        return employeeRepo.findAll();
    }
}
