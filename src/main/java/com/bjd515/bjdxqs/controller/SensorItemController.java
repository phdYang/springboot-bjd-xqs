package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.service.SensorItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorItemController {
    @Autowired
    private SensorItemService sensorItemService;
    @PostMapping("/getItemList")
    public String getItemList() { return sensorItemService.getItemList();}
}
