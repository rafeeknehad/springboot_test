package com.example.demo.controller;

import com.example.demo.entity.Ship;
import com.example.demo.services.ShipServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipController {

    @Autowired
    private ShipServices shipServices;

    @PostMapping(path = "/ship")
    public void insertShip(@RequestBody Ship ship){
        shipServices.insertShip(ship);
    }
}
