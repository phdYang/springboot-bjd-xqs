package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.model.Sensor;
import com.bjd515.bjdxqs.service.impl.SensorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname SensorController
 * @Description sensor的controller类
 * @Date 2018/9/19 14:49
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * /getSensor
 */
@RestController
//@RequestMapping("/sensor")
public class SensorController {
    @Autowired
    private SensorServiceImpl sensorService;

    /**
     * 获取全部传感器
     * @return
     * @test yes
     */
    @PostMapping("/getSensor")
    public ResultVO<DataVO> getSensor() {
        DataVO dataVO = new DataVO();
        dataVO.setData(sensorService.getSensor());
        dataVO.setTotal_count(sensorService.getSensor().size());
        ResultVO<DataVO> result = new ResultVO<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setResult(dataVO);
        return result;
    }

    /**
     *
     * @param sensor
     * @return
     *
     * @test yes
     */
    @PostMapping("/api/getSensorByOther")
    public String getSensorByOther(Sensor sensor) {
        return sensorService.getSensorByOther(sensor);
    }

    /**
     *
     * @param sensor
     * @return
     *
     * @test
     */
    @GetMapping("/api/addSensor")
    public String sensorAdd(Sensor sensor) {
        return sensorService.sensorAdd(sensor);
    }

    /**
     * @test yes
     *
     * @param sensor
     * @return
     */
    @GetMapping("/api/getSensorDetail")
    public String getDetailList(Sensor sensor) {
        return sensorService.getSensorDetail(sensor);
    }

    /**
     * @test yes
     * @param sensor
     * @return
     */
    @GetMapping("/api/getSensorEdit")
    public String getEditList(Sensor sensor) {
        return sensorService.getSensorEdit(sensor);
    }

    @GetMapping("/api/editSensor")
    public String sensorEdited(Sensor sensor) {
        return sensorService.sensorEdited(sensor);
    }

    @GetMapping("/api/delSensor")
    public String sensorDel(Sensor sensor) {
        return sensorService.sensorDel(sensor);
    }

}
