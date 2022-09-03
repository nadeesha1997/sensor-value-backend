package com.ireshrajitha.demo.services;

import com.ireshrajitha.demo.model.Sensor;
import com.ireshrajitha.demo.repos.SensorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {
    @Autowired
    private SensorRepo sensorRepo;

    public List<Sensor> getAll(){
        return sensorRepo.findAll();
    }
}
