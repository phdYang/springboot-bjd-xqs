package com.bjd515.bjdxqs.service;


import com.bjd515.bjdxqs.model.Device;

import java.util.List;


public interface DeviceService {

    public List<Device> getDevice() ;

    public int getDeviceTotal();

    public List<Device> getDeviceByOther(String deviceName);

    public int getDeviceByOtherTotal(String deviceName);

    public int deviceAdd(Device device) ;

    public Device getDeviceDetail(Device device) ;

    public Device getDeviceEdit(Device device) ;


    public int deviceEdited(Device device);

    public int deviceDel(Device device) ;
}
