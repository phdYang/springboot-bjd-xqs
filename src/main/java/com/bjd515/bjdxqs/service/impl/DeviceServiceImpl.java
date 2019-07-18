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

    public String getDeviceByOther(Device device) {
        String rs = "";
        int code;
        String msg;
        String result;
        String data;
        JSONObject jsonObject = new JSONObject();
        //Device device = JSON.parseObject(json,Device.class);
        List<Device> list = deviceMapper.getDeviceByOther(device);
        int total = deviceMapper.getDeviceByOtherTotal(device);
        if(list != null) {
            jsonObject.put("data",list);
            jsonObject.put("total_count",total);
            result = jsonObject.toJSONString();
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'没有查询到相关数据";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    public String deviceAdd(Device device) {
        String rs = "";
        int code;
        String msg;
        String result;
        //Device device = JSON.parseObject(json,Device.class);
        int ret = deviceMapper.deviceAdd(device);
        if(ret > 0) {
            result = "{}";
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'failed";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    public String getDeviceDetail(Device device) {
        String rs = "";
        int code;
        String msg;
        String result;
        String data;
        JSONObject jsonObject = new JSONObject();
        //Device device = JSON.parseObject(json,Device.class);
        Device list = deviceMapper.getDeviceDetail(device);
        if(list != null) {
            jsonObject.put("data",list);
            result = jsonObject.toJSONString();
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'没有查询到相关数据";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    public String getDeviceEdit(Device device) {
        String rs = "";
        int code;
        String msg;
        String result;
        String data;
        JSONObject jsonObject = new JSONObject();
        //Device device = JSON.parseObject(json,Device.class);
        Device list = deviceMapper.getDeviceEdit(device);
        if(list != null) {
            jsonObject.put("data",list);
            result = jsonObject.toJSONString();
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'没有查询到相关数据";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }


    public String deviceEdited(Device device) {
        String rs = "";
        int code;
        String msg;
        String result;
        //Device device = JSON.parseObject(json,Device.class);
        int ret = deviceMapper.deviceEdited(device);
        if(ret > 0) {
            result = "{}";
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'failed";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

    public String deviceDel(Device device) {
        String rs = "";
        int code;
        String msg;
        String result;
        //Device device = JSON.parseObject(json,Device.class);
        int ret = deviceMapper.deviceDel(device);
        if(ret > 0) {
            result = "{}";
            msg = "success";
            code = 0;
        }else {
            result = "{}";
            code = 1;
            msg = "'failed";
        }
        rs = JsonUtilsMy.packJson(code,msg,result);
        return rs;
    }

}
