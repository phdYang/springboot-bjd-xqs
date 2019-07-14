package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.service.SensorTargetService;
import com.bjd515.bjdxqs.service.impl.SensorTargetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorTargetController {
    @Autowired
    private SensorTargetService sensorTargetService;

    @PostMapping("/getTargetList")
    public ResultVO<DataVO> getTargetList() {
        DataVO dataVO = new DataVO();
        dataVO.setData(sensorTargetService.getTargetList());
        dataVO.setTotal_count(sensorTargetService.getTargetListTotal());
        ResultVO<DataVO> result = new ResultVO<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setResult(dataVO);
        return result;
    }
}
