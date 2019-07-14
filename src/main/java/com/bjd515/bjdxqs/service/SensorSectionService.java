package com.bjd515.bjdxqs.service;

import com.alibaba.fastjson.JSONObject;
import com.bjd515.bjdxqs.mapper.SensorSectionMapper;
import com.bjd515.bjdxqs.model.SensorSection;
import com.bjd515.bjdxqs.utils.JsonUtilsMy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorSectionService {
    @Autowired
    private SensorSectionMapper sensorSectionMapper;
    public String getSectionList() {
        String rs = "";
        int code;
        String msg;
        String result;
        String data;
        JSONObject jsonObject = new JSONObject();
        List<SensorSection> list = sensorSectionMapper.getSectionList();
        int total = sensorSectionMapper.getSectionListTotal();
        if(list != null) {
            jsonObject.put("data",list);
            jsonObject.put("total_count",total);
            result = jsonObject.toJSONString();
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'没有查询到相关数据";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }
}
