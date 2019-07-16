package com.bjd515.bjdxqs.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bjd515.bjdxqs.mapper.SensorMapper;
import com.bjd515.bjdxqs.model.Sensor;
import com.bjd515.bjdxqs.service.SensorService;
import com.bjd515.bjdxqs.utils.JsonUtilsMy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname SensorService
 * @Description sensor的service类
 * @Date 2018/9/19 14:46
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * @Date 2019/7/16 18:50
 * @Changed by zhaoyang
 * getSensor
 */
@Service
public class SensorServiceImpl implements SensorService {
    @Autowired
    private SensorMapper sensorMapper;

    @Override
    public List<Sensor> getSensor() {
        return sensorMapper.getSensor();
    }

    @Override
    public int getSensorTotal(){
        return sensorMapper.getSensorTotal();
    }

    @Override
    public List<Sensor> getSensorByOther(Sensor sensor) {
        return sensorMapper.getSensorByOther(sensor);
    }

    @Override
    public int getSensorByOtherTotal(Sensor sensor) {
        return sensorMapper.getSensorByOtherTotal(sensor);
    }

    @Override
    public int sensorAdd(Sensor sensor) {
        return sensorMapper.sensorAdd(sensor);
    }

    @Override
    public Sensor getSensorDetail(Sensor sensor) {
        return sensorMapper.getSensorDetail(sensor);
    }

    @Override
    public Sensor getSensorEdit(Sensor sensor) {
        return sensorMapper.getSensorEdit(sensor);
    }

    @Override
    public int sensorEdited(Sensor sensor) {
        return sensorMapper.sensorEdited(sensor);
    }

    @Override
    public int sensorDel(Sensor sensor) {
        return sensorMapper.sensorDel(sensor);
    }

}
