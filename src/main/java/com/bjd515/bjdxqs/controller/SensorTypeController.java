package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.service.SensorTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorTypeController {
    @Autowired
    private SensorTypeService sensorTypeService;
    @PostMapping("/getTypeList")
    public String getTypeList() { return sensorTypeService.getTypeList();}
}
