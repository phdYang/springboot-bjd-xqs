package com.bjd515.bjdxqs.model;

/**
 * @Classname Sensor
 * @Description t_sensor表的model
 * @Date 2018/9/19 14:40
 * @Created by zhaoyang
 * @Date 2019/1/17 14:49
 * @Changed by chenghuayu
 */
public class Sensor {

    private int sensorId;
    private int targetId;
    private int sectionId;
    private int typeId;
    private int sensorItemId;
    private String sensorItemName;
    private String sensorName;
    private String targetName;
    private String sectionName;
    private String typeName;
    private String channelCode;
    private String sensorCode;
    private float initKValue;
    private float initWave;
    private int initOrientations;
    private float bdWave;
    private float bdTemperature;
    private String info;
    private String sDesc;
    private int isValid;

    public Sensor() {
    }

    public Sensor(int sensorId, int targetId, int sectionId, int typeId, int sensorItemId, String sensorItemName, String sensorName, String targetName, String sectionName, String typeName, String channelCode, String sensorCode, float initKValue, float initWave, int initOrientations, float bdWave, float bdTemperature, String info, String sDesc, int isValid) {
        this.sensorId = sensorId;
        this.targetId = targetId;
        this.sectionId = sectionId;
        this.typeId = typeId;
        this.sensorItemId = sensorItemId;
        this.sensorItemName = sensorItemName;
        this.sensorName = sensorName;
        this.targetName = targetName;
        this.sectionName = sectionName;
        this.typeName = typeName;
        this.channelCode = channelCode;
        this.sensorCode = sensorCode;
        this.initKValue = initKValue;
        this.initWave = initWave;
        this.initOrientations = initOrientations;
        this.bdWave = bdWave;
        this.bdTemperature = bdTemperature;
        this.info = info;
        this.sDesc = sDesc;
        this.isValid = isValid;
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getSensorItemId() {
        return sensorItemId;
    }

    public void setSensorItemId(int sensorItemId) {
        this.sensorItemId = sensorItemId;
    }

    public String getSensorItemName() {
        return sensorItemName;
    }

    public void setSensorItemName(String sensorItemName) {
        this.sensorItemName = sensorItemName;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getSensorCode() {
        return sensorCode;
    }

    public void setSensorCode(String sensorCode) {
        this.sensorCode = sensorCode;
    }

    public float getInitKValue() {
        return initKValue;
    }

    public void setInitKValue(float initKValue) {
        this.initKValue = initKValue;
    }

    public float getInitWave() {
        return initWave;
    }

    public void setInitWave(float initWave) {
        this.initWave = initWave;
    }

    public int getInitOrientations() {
        return initOrientations;
    }

    public void setInitOrientations(int initOrientations) {
        this.initOrientations = initOrientations;
    }

    public float getBdWave() {
        return bdWave;
    }

    public void setBdWave(float bdWave) {
        this.bdWave = bdWave;
    }

    public float getBdTemperature() {
        return bdTemperature;
    }

    public void setBdTemperature(float bdTemperature) {
        this.bdTemperature = bdTemperature;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "sensorId=" + sensorId +
                ", targetId=" + targetId +
                ", sectionId=" + sectionId +
                ", typeId=" + typeId +
                ", sensorItemId=" + sensorItemId +
                ", sensorItemName='" + sensorItemName + '\'' +
                ", sensorName='" + sensorName + '\'' +
                ", targetName='" + targetName + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", channelCode='" + channelCode + '\'' +
                ", sensorCode='" + sensorCode + '\'' +
                ", initKValue=" + initKValue +
                ", initWave=" + initWave +
                ", initOrientations=" + initOrientations +
                ", bdWave=" + bdWave +
                ", bdTemperature=" + bdTemperature +
                ", info='" + info + '\'' +
                ", sDesc='" + sDesc + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
