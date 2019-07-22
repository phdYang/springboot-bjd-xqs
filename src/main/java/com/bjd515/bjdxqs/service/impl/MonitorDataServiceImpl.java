package com.bjd515.bjdxqs.service.impl;

import com.alibaba.fastjson.JSON;
import com.bjd515.bjdxqs.Vo.TreeVO;
import com.bjd515.bjdxqs.dto.MonitorSearchDTO;
import com.bjd515.bjdxqs.mapper.MonitorDataMapper;
import com.bjd515.bjdxqs.mapper.SensorMapper;
import com.bjd515.bjdxqs.model.MonitorData;
import com.bjd515.bjdxqs.service.MonitorDataService;
import com.bjd515.bjdxqs.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonitorDataServiceImpl implements MonitorDataService {

    @Autowired
    private MonitorDataMapper repository;

    @Autowired
    private SensorService sensorService;

    @Autowired
    private SensorMapper sensorMapper;

    @Override
    public List getMonitorData(MonitorSearchDTO params) {
        // SensorId + monitorDate
        // 返回给上级的是 {'..':[]},{}
        List rs = new ArrayList<>();
        // 处理时间
        String begin = params.getDataRange().get(0).split(":")[1].split("\"")[1];
        String end = params.getDataRange().get(1).split(":")[1].split("\"")[1];

        //List<TreeVO> treeVOList = sensorService.getTreeSensor();

        List<String> sensorItemId = params.getSensorItemId();
        for (int i = 0; i < sensorItemId.size(); i++) {
            String str = params.getSensorItemId().get(i);
            //String iStr = str.split(":")[1].split("-")[0].split("\"")[1];
            String jStr = str.split(":")[1].split("-")[1].split("\"")[0];
            //String sensorName = treeVOList.get(Integer.parseInt(iStr)).getChildren().get(Integer.parseInt(jStr)).getTitle();

            String sensorName =  sensorMapper.getSensorName(jStr);

            List<MonitorData> dataList = repository.getMonitorData(begin,end,jStr);

            String rsStr = "{\""+sensorName+"\":"+dataList+"}";

            rs.add(JSON.parseObject(rsStr));
        }
        return rs;
    }
}
