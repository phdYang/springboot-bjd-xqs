package com.bjd515.bjdxqs.model;

public class SensorItem {
    private int itemId;
    private String itemName;
    private String shortName;
    private int isValid;
    private float sDesc;

    public SensorItem() {
    }
    public SensorItem(int itemId, String itemName, String shortName, int isValid, float sDesc) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.shortName = shortName;
        this.isValid = isValid;
        this.sDesc = sDesc;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
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
