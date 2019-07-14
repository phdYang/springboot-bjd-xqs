package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.service.SensorTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorTargetController {
    @Autowired
    private SensorTargetService sensorTargetService;
    @PostMapping("/getTargetList")
    public String getTargetList() { return sensorTargetService.getTargetList();}
}
