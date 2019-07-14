package com.bjd515.bjdxqs.service.impl;

import com.bjd515.bjdxqs.mapper.SensorSectionMapper;
import com.bjd515.bjdxqs.model.SensorSection;
import com.bjd515.bjdxqs.service.SensorSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorSectionServiceImpl implements SensorSectionService {

    @Autowired
    private SensorSectionMapper sensorSectionMapper;

    @Override
    public List<SensorSection> getSectionList() {
        return sensorSectionMapper.getSectionList();
    }

    @Override
    public int getSectionListTotal() {
        return sensorSectionMapper.getSectionListTotal();
    }
}
