package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.service.SensorSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorSectionController {
    @Autowired
    private SensorSectionService sensorSectionService;
    @PostMapping("/getSectionList")
    public String getSectionList() {
        return sensorSectionService.getSectionList();
    }
}
