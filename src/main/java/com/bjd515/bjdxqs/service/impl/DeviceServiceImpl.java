package com.bjd515.bjdxqs.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bjd515.bjdxqs.mapper.DeviceMapper;
import com.bjd515.bjdxqs.model.Device;
import com.bjd515.bjdxqs.service.DeviceService;
import com.bjd515.bjdxqs.utils.JsonUtilsMy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname DeviceService
 * @Description device的service类
 * @Date 2018/9/19 14:46
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * getDevice
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public List<Device> getDevice() {
        return deviceMapper.getDevice();
    }

    @Override
    public int getDeviceTotal(){
        return deviceMapper.getDeviceTotal();
    }

    @Override
    public List<Device> getDeviceByOther(String deviceName) {
        return deviceMapper.getDeviceByOther(deviceName);
    }

    @Override
    public int getDeviceByOtherTotal(String deviceName){
        return deviceMapper.getDeviceByOtherTotal(deviceName);
    }

    @Override
    public int deviceAdd(Device device) {
        return deviceMapper.deviceAdd(device);
    }

    public Device getDeviceDetail(Device device) {
       return deviceMapper.getDeviceDetail(device);
    }

    public Device getDeviceEdit(Device device) {
       return deviceMapper.getDeviceEdit(device);
    }


    public int deviceEdited(Device device) {
        return deviceMapper.deviceEdited(device);
    }

    public int deviceDel(Device device) {
       return deviceMapper.deviceDel(device);
    }

}
