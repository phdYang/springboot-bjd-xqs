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
        System.out.println(device);

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
            result.setCode(0);
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
    @GetMapping("/api/getDeviceDetail")
    public String getDetailList(Device device) {
        return deviceService.getDeviceDetail(device);
    }

    /**
     * @test yes
     * @param device
     * @return
     */
    @GetMapping("/api/getDeviceEdit")
    public String getEditList(Device device) {
        return deviceService.getDeviceEdit(device);
    }

    @GetMapping("/api/editDevice")
    public String deviceEdited(Device device) {
        return deviceService.deviceEdited(device);
    }

    @GetMapping("/api/delDevice")
    public String deviceDel(Device device) {
        return deviceService.deviceDel(device);
    }

}
