package com.bjd515.bjdxqs.model;

public class Device {
    private int deviceId;
    private int deviceFre;
    private String deviceName;
    private String deviceIp;
    private int channelCount;
    private int isValid;
    private float sDesc;

    public  Device() {
    }

    public Device(int deviceId, int deviceFre, String deviceName, String deviceIp, int channelCount, int isValid, float sDesc) {
        this.deviceId = deviceId;
        this.deviceFre = deviceFre;
        this.deviceName = deviceName;
        this.deviceIp = deviceIp;
        this.channelCount = channelCount;
        this.isValid = isValid;
        this.sDesc = sDesc;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getDeviceFre() {
        return deviceFre;
    }

    public void setDeviceFre(int deviceFre) {
        this.deviceFre = deviceFre;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public int getChannelCount() {
        return channelCount;
    }

    public void setChannelCount(int channelCount) {
        this.channelCount = channelCount;
    }

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }

    public float getsDesc() {
        return sDesc;
    }

    public void setsDesc(float sDesc) {
        this.sDesc = sDesc;
    }
}
