package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ObjVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.model.Device;
import com.bjd515.bjdxqs.service.DeviceService;
import com.bjd515.bjdxqs.utils.DateUtilsMy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname DeviceController
 * @Description device的controller类
 * @Date 2018/9/19 14:49
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * /getDevice
 */
@RestController
//@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    /**
     * 获取全部device
     * @return
     * @test yes
     */
    @PostMapping("/getDevice")
    public ResultVO<DataVO> getDevice() {
        ResultVO<DataVO> result = new ResultVO<>();
        DataVO dataVO = new DataVO();
        dataVO.setTotal_count(deviceService.getDeviceTotal());
        dataVO.setData(deviceService.getDevice());

        result.setCode(0);
        result.setMsg("成功");
        result.setResult(dataVO);
        return result;
    }

    /**
     *
     * @param
     * @return
     *
     * @test yes
     */
    @PostMapping("/getDeviceByOther")
    public ResultVO<DataVO> getDeviceByOther(String deviceName) {
        ResultVO<DataVO> result = new ResultVO<>();
        DataVO dataVO = new DataVO();
        dataVO.setTotal_count(deviceService.getDeviceByOtherTotal(deviceName));
        dataVO.setData(deviceService.getDeviceByOther(deviceName));

        result.setCode(0);
        result.setMsg("成功");
        result.setResult(dataVO);
        return result;
    }

    /**
     *
     * @param device
     * @return
     *
     * @test
     */
    @GetMapping("/addDevice")
    public ResultVO<ObjVO> deviceAdd(Device device) {
        ResultVO<ObjVO> result = new ResultVO<>();
        ObjVO<Integer> objVO = new ObjVO<>();
        //生成随机数
        device.setDeviceCode(DateUtilsMy.getTimeStap());
        device.setIsValid(1);
        int count = deviceService.deviceAdd(device);
        objVO.setData(count);
        if(count>0){
            result.setCode(0);
            result.setMsg("增加成功");
            result.setResult(objVO);
        }else {
            result.setCode(1);
            result.setMsg("增加失败");
            result.setResult(objVO);
        }
        return result;
    }

    /**
     * @test yes
     *
     * @param device
     * @return
     */
    @GetMapping("/getDeviceDetail")
    public ResultVO<ObjVO> getDeviceDetail(Device device) {
        ResultVO<ObjVO> result = new ResultVO<>();
        ObjVO<Device> objVO = new ObjVO<>();
        objVO.setData(deviceService.getDeviceDetail(device));

        result.setCode(0);
        result.setMsg("查询成功");
        result.setResult(objVO);
        return result;
    }

    /**
     * @test yes
     * @param device
     * @return
     */
    @GetMapping("/getDeviceEdit")
    public ResultVO<ObjVO> getEditList(Device device) {
        ResultVO<ObjVO> result = new ResultVO<>();
        ObjVO<Device> objVO = new ObjVO<>();
        objVO.setData(deviceService.getDeviceEdit(device));

        result.setCode(0);
        result.setMsg("查询成功");
        result.setResult(objVO);
        return result;
    }

    @GetMapping("/editDevice")
    public ResultVO<ObjVO> deviceEdited(Device device) {
        ResultVO<ObjVO> result = new ResultVO<>();
        ObjVO<Integer> objVO = new ObjVO<>();
        int count = deviceService.deviceEdited(device);
        objVO.setData(count);
        if(count>0){
            result.setCode(0);
            result.setMsg("修改成功");
            result.setResult(objVO);
        }else {
            result.setCode(1);
            result.setMsg("修改失败");
            result.setResult(objVO);
        }
        return result;
    }

    @GetMapping("/delDevice")
    public ResultVO<ObjVO> deviceDel(Device device) {
        ResultVO<ObjVO> result = new ResultVO<>();
        ObjVO<Integer> objVO = new ObjVO<>();
        int count = deviceService.deviceDel(device);
        objVO.setData(count);
        if(count>0){
            result.setCode(0);
            result.setMsg("删除成功");
            result.setResult(objVO);
        }else {
            result.setCode(1);
            result.setMsg("删除失败");
            result.setResult(objVO);
        }
        return result;
    }

}
