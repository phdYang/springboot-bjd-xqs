package com.bjd515.bjdxqs.service;


import com.bjd515.bjdxqs.model.Device;

import java.util.List;


public interface DeviceService {

    public List<Device> getDevice() ;

    public int getDeviceTotal();

    public List<Device> getDeviceByOther(String deviceName);

    public int getDeviceByOtherTotal(String deviceName);

    public int deviceAdd(Device device) ;

    public String getDeviceDetail(Device device) ;

    public String getDeviceEdit(Device device) ;


    public String deviceEdited(Device device);

    public String deviceDel(Device device) ;
}
