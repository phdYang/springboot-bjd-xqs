package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.service.SensorSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorSectionController {
    @Autowired
    private SensorSectionService sensorSectionService;


    @PostMapping("/getSectionList")
    public ResultVO<DataVO> getSectionList() {
        DataVO dataVO = new DataVO();
        dataVO.setData(sensorSectionService.getSectionList());
        dataVO.setTotal_count(sensorSectionService.getSectionListTotal());
        ResultVO<DataVO> result = new ResultVO<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setResult(dataVO);
        return result;
    }
}
