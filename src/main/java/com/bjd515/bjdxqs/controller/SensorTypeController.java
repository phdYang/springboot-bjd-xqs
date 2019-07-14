package com.bjd515.bjdxqs.controller;



import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.service.SensorTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorTypeController {
    @Autowired
    private SensorTypeService sensorTypeService;

    @PostMapping("/getTypeList")
    public ResultVO<DataVO> getTypeList() {
        DataVO dataVO = new DataVO();
        dataVO.setData(sensorTypeService.getTypeList());
        dataVO.setTotal_count(sensorTypeService.getTypeListTotal());
        ResultVO<DataVO> result = new ResultVO<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setResult(dataVO);
        return result;
    }
}
