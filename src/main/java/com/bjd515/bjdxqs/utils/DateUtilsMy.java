package com.bjd515.bjdxqs.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Classname DateUtilsMy
 * @Description 自定义的时间类
 * @Date 2018/9/11 15:07
 * @Created by zhaoyang
 */
public class DateUtilsMy {



    public static String getTimeStr(String str){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        str = sdf.format(str);
        return str;
    }
    /**
     * 获得系统当前时间 yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String getCurrentTiem() {
        String currentTime = "";
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        currentTime = sdf.format(d);
        return currentTime;
    }

    /**
     * 获取当前时间戳
     * @return
     */
    public static String getTimeStap(){
        return Calendar.getInstance().getTimeInMillis()+"";
    }
    /**
     * 将指定日期加指定天数
     * @param currentTime
     * @param day
     * @return
     */
    public static String addDay(String currentTime,int day) {
        String endTime = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date cd = null;
        try {
            cd = sdf.parse(currentTime);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(cd);
        c.add(Calendar.DATE, day);

        Date  ed = c.getTime();
        endTime = sdf.format(ed);
        return endTime;
    }

    public static String addYear(String currentTime,int year) {
        String endTime = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date cd = null;
        try {
            cd = sdf.parse(currentTime);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(cd);
        c.add(Calendar.YEAR, year);

        Date  ed = c.getTime();
        endTime = sdf.format(ed);
        return endTime;
    }

    public static String addYear2(String currentTime,int year) {
        String endTime = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date cd = null;
        try {
            cd = sdf.parse(currentTime);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(cd);
        c.add(Calendar.YEAR, year);

        Date  ed = c.getTime();
        endTime = sdf.format(ed);
        return endTime;
    }

    public static void main(String[] args) {
        System.out.println(DateUtilsMy.getTimeStap());
    }
}
