package com.chandimal.setallite_dataHub.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "Weather_Conditions")
@Entity
public class WeatherConditions {

    @Id
    @Column(name = "Condition_ID")
    private String ConditionID;

    @Column(name = "Location_ID")
    private String LocationID;

    @Column(name = "Time_ID")
    private String TimeID;

    @Column(name = "Temperature_C")
    private double TemperatureC;

    @Column(name = "Wind_Speed_kmh")
    private double WindSpeed_kmh;

    @Column(name = "Precipitation")
    private double Precipitation;
}
