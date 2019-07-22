package com.bjd515.bjdxqs.controller;

import com.alibaba.fastjson.JSONObject;
import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.dto.MonitorSearchDTO;
import com.bjd515.bjdxqs.service.MonitorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MonitorDataController {

    @Autowired
    private MonitorDataService monitorDataService;

    @PostMapping("/getMonitorData")
    public ResultVO getMonitorData(MonitorSearchDTO params){
        ResultVO result = new ResultVO();
        DataVO dataVO = new DataVO();
        dataVO.setData(monitorDataService.getMonitorData(params));
        result.setCode(0);
        result.setMsg("数据获取成功");
        result.setResult(dataVO);
        return result;
    }
}
