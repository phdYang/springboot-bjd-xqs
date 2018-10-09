package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname SensorController
 * @Description senso的controller类
 * @Date 2018/9/19 14:49
 * @Created by zhaoyang
 */
@RestController
@RequestMapping("/sensor")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @PostMapping("/getAllSensors")
    public String getAllSensors() {
        return sensorService.getAllSensors();
    }
}
