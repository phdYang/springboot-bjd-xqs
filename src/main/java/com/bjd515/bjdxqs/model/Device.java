package com.bjd515.bjdxqs.model;

import lombok.Data;

@Data
public class Device {


    private int deviceId;

    private String deviceCode;

    private String deviceName;

    private String deviceIp;

    private String deviceUse;

    private String deviceDate;

    private int deviceFre;

    private int channelCount;

    private int isValid;

    private String sDesc;


}
