package com.bjd515.bjdxqs.service;

import com.bjd515.bjdxqs.model.Sensor;

import java.util.List;


public interface SensorService {

    public List<Sensor> getSensor();

    public String getSensorByOther(Sensor sensor) ;

    public String sensorAdd(Sensor sensor) ;

    public String getSensorDetail(Sensor sensor) ;

    public String getSensorEdit(Sensor sensor) ;


    public String sensorEdited(Sensor sensor) ;

    public String sensorDel(Sensor sensor) ;

}
