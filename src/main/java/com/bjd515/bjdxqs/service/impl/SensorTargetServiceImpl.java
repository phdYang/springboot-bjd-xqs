package com.bjd515.bjdxqs.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bjd515.bjdxqs.mapper.SensorTargetMapper;
import com.bjd515.bjdxqs.model.SensorTarget;
import com.bjd515.bjdxqs.service.SensorTargetService;
import com.bjd515.bjdxqs.service.SensorTypeService;
import com.bjd515.bjdxqs.utils.JsonUtilsMy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorTargetServiceImpl implements SensorTargetService {
    @Autowired
    private SensorTargetMapper sensorTargetMapper;

    @Override
    public List<SensorTarget> getTargetList() {
        return sensorTargetMapper.getTargetList();
    }

    @Override
    public int getTargetListTotal() {
        return sensorTargetMapper.getTargetListTotal();
    }
}
