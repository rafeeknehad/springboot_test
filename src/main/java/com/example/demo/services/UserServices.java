package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.shard.Constance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;
    public void insertUser(User user) {
        System.out.println("e7na hena 11");
        user.setStatus(Constance.status);
        user.setStage(Constance.stage);
        userRepository.saveAndFlush(user);
    }
}
