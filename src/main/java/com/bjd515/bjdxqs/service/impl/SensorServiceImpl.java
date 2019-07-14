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
    public String getSensorByOther(Sensor sensor) {
        String rs = "";
        int code;
        String msg;
        String result;
        String data;
        JSONObject jsonObject = new JSONObject();
        //Sensor sensor = JSON.parseObject(json,Sensor.class);
        List<Sensor> list = sensorMapper.getSensorByOther(sensor);
        int total = sensorMapper.getSensorByOtherTotal(sensor);
        if(list != null) {
            jsonObject.put("data",list);
            jsonObject.put("total_count",total);
            result = jsonObject.toJSONString();
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'没有查询到相关数据";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    @Override
    public String sensorAdd(Sensor sensor) {
        String rs = "";
        int code;
        String msg;
        String result;
        //Sensor sensor = JSON.parseObject(json,Sensor.class);
        int ret = sensorMapper.sensorAdd(sensor);
        if(ret > 0) {
            result = "{}";
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'failed";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    @Override
    public String getSensorDetail(Sensor sensor) {
        String rs = "";
        int code;
        String msg;
        String result;
        String data;
        JSONObject jsonObject = new JSONObject();
        //Sensor sensor = JSON.parseObject(json,Sensor.class);
        Sensor list = sensorMapper.getSensorDetail(sensor);
        if(list != null) {
            jsonObject.put("data",list);
            result = jsonObject.toJSONString();
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'没有查询到相关数据";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    @Override
    public String getSensorEdit(Sensor sensor) {
        String rs = "";
        int code;
        String msg;
        String result;
        String data;
        JSONObject jsonObject = new JSONObject();
        //Sensor sensor = JSON.parseObject(json,Sensor.class);
        Sensor list = sensorMapper.getSensorEdit(sensor);
        if(list != null) {
            jsonObject.put("data",list);
            result = jsonObject.toJSONString();
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'没有查询到相关数据";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    @Override
    public String sensorEdited(Sensor sensor) {
        String rs = "";
        int code;
        String msg;
        String result;
        //Sensor sensor = JSON.parseObject(json,Sensor.class);
        int ret = sensorMapper.sensorEdited(sensor);
        if(ret > 0) {
            result = "{}";
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'failed";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    @Override
    public String sensorDel(Sensor sensor) {
        String rs = "";
        int code;
        String msg;
        String result;
        //Sensor sensor = JSON.parseObject(json,Sensor.class);
        int ret = sensorMapper.sensorDel(sensor);
        if(ret > 0) {
            result = "{}";
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'failed";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

}
