package com.bjd515.bjdxqs.service;

import com.alibaba.fastjson.JSONObject;
import com.bjd515.bjdxqs.mapper.SensorMapper;
import com.bjd515.bjdxqs.model.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname SensorService
 * @Description sensor的service类
 * @Date 2018/9/19 14:46
 * @Created by zhaoyang
 */
@Service
public class SensorService {

    @Autowired
    private SensorMapper sensorMapper;

    public String getAllSensors() {
        String rs = "";
        JSONObject jsonObject = new JSONObject();
        List<Sensor> list = sensorMapper.getAllSensors();
        if(list != null) {
            rs = jsonObject.toJSONString(list);
        }else {
            rs = "[]";
        }
        return rs;
    }

}
