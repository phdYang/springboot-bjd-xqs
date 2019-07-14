package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.model.Sensor;
import com.bjd515.bjdxqs.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname SensorController
 * @Description sensor的controller类
 * @Date 2018/9/19 14:49
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * /getSensor
 */
@RestController
//@RequestMapping("/sensor")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    /**
     * 获取全部传感器
     * @return
     * @test yes
     */
    @PostMapping("/getSensor")
    public String getSensor() {
        return sensorService.getSensor();
    }

    /**
     *
     * @param sensor
     * @return
     *
     * @test yes
     */
    @PostMapping("/api/getSensorByOther")
    public String getSensorByOther(Sensor sensor) {
        return sensorService.getSensorByOther(sensor);
    }

    /**
     *
     * @param sensor
     * @return
     *
     * @test
     */
    @GetMapping("/api/addSensor")
    public String sensorAdd(Sensor sensor) {
        return sensorService.sensorAdd(sensor);
    }

    /**
     * @test yes
     *
     * @param sensor
     * @return
     */
    @GetMapping("/api/getSensorDetail")
    public String getDetailList(Sensor sensor) {
        return sensorService.getSensorDetail(sensor);
    }

    /**
     * @test yes
     * @param sensor
     * @return
     */
    @GetMapping("/api/getSensorEdit")
    public String getEditList(Sensor sensor) {
        return sensorService.getSensorEdit(sensor);
    }

    @GetMapping("/api/editSensor")
    public String sensorEdited(Sensor sensor) {
        return sensorService.sensorEdited(sensor);
    }

    @GetMapping("/api/delSensor")
    public String sensorDel(Sensor sensor) {
        return sensorService.sensorDel(sensor);
    }

}
