package com.ireshrajitha.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "sensor")
public class Sensor {
    @Id
    private String id;
    private String sensor_id;
    private String date;
    private int data_value;


}
