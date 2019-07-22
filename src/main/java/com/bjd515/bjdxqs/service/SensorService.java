package com.bjd515.bjdxqs.service;

import com.bjd515.bjdxqs.Vo.TreeVO;
import com.bjd515.bjdxqs.model.Sensor;

import java.util.List;


public interface SensorService {

    public List<Sensor> getSensor();

    public int getSensorTotal();

    public List<Sensor> getSensorByOther(Sensor sensor) ;

    public int getSensorByOtherTotal(Sensor sensor);

    public int sensorAdd(Sensor sensor) ;

    public Sensor getSensorDetail(Sensor sensor) ;

    public Sensor getSensorEdit(Sensor sensor) ;


    public int sensorEdited(Sensor sensor) ;

    public int sensorDel(Sensor sensor) ;

    public List<TreeVO> getTreeSensor();

}
