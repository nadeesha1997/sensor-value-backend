package com.ireshrajitha.demo.controller;

import com.ireshrajitha.demo.model.Sensor;
import com.ireshrajitha.demo.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sensor")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @GetMapping
    public List<Sensor> getAll(){
        return sensorService.getAll();
    }
}
