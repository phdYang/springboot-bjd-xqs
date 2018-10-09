package com.bjd515.bjdxqs.model;

/**
 * @Classname Sensor
 * @Description t_sensor表的model
 * @Date 2018/9/19 14:40
 * @Created by zhaoyang
 */
public class Sensor {

    private int sensorId;

    private String sensorName;

    private int targetId;

    private int sectionId;

    private int typeId;

    public Sensor() {
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
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
}
