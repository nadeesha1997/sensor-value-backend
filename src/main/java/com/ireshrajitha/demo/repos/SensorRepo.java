package com.ireshrajitha.demo.repos;

import com.ireshrajitha.demo.model.Sensor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SensorRepo extends MongoRepository<Sensor, String> {
}
