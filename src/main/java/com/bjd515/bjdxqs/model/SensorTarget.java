package com.bjd515.bjdxqs.model;

public class SensorTarget {
    private int targetId;
    private String targetName;
    private int isValid;
    private String sDesc;

    public SensorTarget() {
    }
    public SensorTarget(int targetId, String targetName, int isValid, String sDesc) {
        this.targetId = targetId;
        this.targetName = targetName;
        this.isValid = isValid;
        this.sDesc = sDesc;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }
}
