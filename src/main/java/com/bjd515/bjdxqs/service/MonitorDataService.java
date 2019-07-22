package com.bjd515.bjdxqs.service;

import com.bjd515.bjdxqs.dto.MonitorSearchDTO;
import com.bjd515.bjdxqs.model.MonitorData;

import java.util.List;

public interface MonitorDataService {

    public List getMonitorData(MonitorSearchDTO params);
}
