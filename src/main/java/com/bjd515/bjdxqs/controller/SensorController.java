package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ObjVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.model.Sensor;
import com.bjd515.bjdxqs.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname SensorController
 * @Description sensor的controller类
 * @Date 2018/9/19 14:49
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * @Date 2019/7/16 18:50
 * @Changed by zhaoyang
 * /getSensor
 */
@RestController
public class SensorController {

    @Autowired
    private SensorService sensorService;

    /**
     * 获取全部传感器
     * @return
     * @test yes
     */
    @PostMapping("/getSensor")
    public ResultVO<DataVO> getSensor() {
        DataVO dataVO = new DataVO();
        dataVO.setData(sensorService.getSensor());
        dataVO.setTotal_count(sensorService.getSensorTotal());
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
    @PostMapping("/getSensorByOther")
    public ResultVO<DataVO> getSensorByOther(Sensor sensor) {

        DataVO dataVO = new DataVO();
        dataVO.setData(sensorService.getSensorByOther(sensor));
        dataVO.setTotal_count(sensorService.getSensorByOtherTotal(sensor));
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
     * @test
     */
    @GetMapping("/addSensor")
    public ResultVO<ObjVO> sensorAdd(Sensor sensor) {
        // isValid
        sensor.setIsValid(1);
        ResultVO result = new ResultVO();
        int rs = sensorService.sensorAdd(sensor);
        if (rs>0){
            result.setCode(0);
            result.setMsg("增加成功");
            result.setResult(null);
        }else {
            result.setCode(1);
            result.setMsg("增加失败");
            result.setResult(null);
        }
        return result;
    }

    /**
     *
     * @param sensor
     * @return
     *  @test yes
     */
    @GetMapping("/getSensorDetail")
    public ResultVO<ObjVO> getDetailList(Sensor sensor) {
        ObjVO objVO = new ObjVO();
        objVO.setData(sensorService.getSensorDetail(sensor));
        ResultVO<ObjVO> result = new ResultVO<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setResult(objVO);
        return result;
    }

    /**
     * @test yes
     * @param sensor
     * @return
     */
    @GetMapping("/getSensorEdit")
    public ResultVO<ObjVO> getEditList(Sensor sensor) {
        ObjVO objVO = new ObjVO();
        objVO.setData(sensorService.getSensorEdit(sensor));
        ResultVO<ObjVO> result = new ResultVO<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setResult(objVO);
        return result;
    }

    @PostMapping("/editSensor")
    public  ResultVO<ObjVO> sensorEdited(Sensor sensor) {
        ResultVO result = new ResultVO();
        int rs = sensorService.sensorEdited(sensor);
        if (rs>0){
            result.setCode(0);
            result.setMsg("修改成功");
            result.setResult(null);
        }else {
            result.setCode(1);
            result.setMsg("修改失败");
            result.setResult(null);
        }
        return result;
    }

    @GetMapping("/delSensor")
    public ResultVO<ObjVO> sensorDel(Sensor sensor) {
        ResultVO result = new ResultVO();
        int rs = sensorService.sensorDel(sensor);
        if (rs>0){
            result.setCode(0);
            result.setMsg("删除成功");
            result.setResult(null);
        }else {
            result.setCode(1);
            result.setMsg("删除失败");
            result.setResult(null);
        }
        return result;
    }

}
