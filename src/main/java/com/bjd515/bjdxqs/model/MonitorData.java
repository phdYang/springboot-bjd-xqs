package com.bjd515.bjdxqs.model;


public class MonitorData {


    private double monitorValue;

    private String monitorDate;

    @Override
    public String toString() {
        return "{monitorValue:" + monitorValue +
                ", monitorDate:'" + monitorDate + '\'' +
                '}';
    }

    public double getMonitorValue() {
        return monitorValue;
    }

    public void setMonitorValue(double monitorValue) {
        this.monitorValue = monitorValue;
    }

    public String getMonitorDate() {
        return monitorDate;
    }

    public void setMonitorDate(String monitorDate) {
        this.monitorDate = monitorDate;
    }


}
