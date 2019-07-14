package com.bjd515.bjdxqs.service;

import com.bjd515.bjdxqs.model.SensorType;

import java.util.List;

public interface SensorTypeService {

    public List<SensorType> getTypeList();

    public int getTypeListTotal();
}
