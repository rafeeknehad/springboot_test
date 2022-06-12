package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping(path = "/user")
    public void insertUser(@RequestBody User user)
    {
        System.out.println("e7na hena");
        userServices.insertUser(user);
    }
}
