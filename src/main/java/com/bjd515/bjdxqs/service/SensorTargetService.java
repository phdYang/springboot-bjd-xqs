package com.bjd515.bjdxqs.service;

import com.bjd515.bjdxqs.model.SensorTarget;

import java.util.List;

public interface SensorTargetService {

    public List<SensorTarget> getTargetList();

    public int getTargetListTotal();
}
