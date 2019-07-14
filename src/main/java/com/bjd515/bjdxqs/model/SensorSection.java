package com.bjd515.bjdxqs.model;

public class SensorSection {
    private int sectionId;
    private String sectionName;
    private int isValid;
    private String sDesc;

    public SensorSection() {
    }
    public SensorSection(int sectionId, String sectionName, int isValid, String sDesc) {
        this.sectionId = sectionId;
        this.sectionName = sectionName;
        this.isValid = isValid;
        this.sDesc = sDesc;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
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
