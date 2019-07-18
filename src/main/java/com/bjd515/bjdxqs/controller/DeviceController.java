package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.model.Device;
import com.bjd515.bjdxqs.service.DeviceService;
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
     * 获取全部传感器
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
     * @param device
     * @return
     *
     * @test yes
     */
    @PostMapping("/api/getDeviceByOther")
    public String getDeviceByOther(Device device) {
        return deviceService.getDeviceByOther(device);
    }

    /**
     *
     * @param device
     * @return
     *
     * @test
     */
    @GetMapping("/api/addDevice")
    public String deviceAdd(Device device) {
        return deviceService.deviceAdd(device);
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
