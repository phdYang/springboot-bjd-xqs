package com.bjd515.bjdxqs.service.impl;


import com.bjd515.bjdxqs.mapper.SensorTypeMapper;
import com.bjd515.bjdxqs.model.SensorType;
import com.bjd515.bjdxqs.service.SensorTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorTypeServiceImpl implements SensorTypeService {
    @Autowired
    private SensorTypeMapper sensorTypeMapper;

    @Override
    public List<SensorType> getTypeList() {
        return sensorTypeMapper.getTypeList();
    }

    @Override
    public int getTypeListTotal() {
        return sensorTypeMapper.getTypeListTotal();
    }

}
