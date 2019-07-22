package com.bjd515.bjdxqs.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bjd515.bjdxqs.Vo.TreeVO;
import com.bjd515.bjdxqs.mapper.SensorItemMapper;
import com.bjd515.bjdxqs.mapper.SensorMapper;
import com.bjd515.bjdxqs.model.Sensor;
import com.bjd515.bjdxqs.model.SensorItem;
import com.bjd515.bjdxqs.service.SensorService;
import com.bjd515.bjdxqs.utils.JsonUtilsMy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname SensorService
 * @Description sensor的service类
 * @Date 2018/9/19 14:46
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * @Date 2019/7/16 18:50
 * @Changed by zhaoyang
 * getSensor
 */
@Service
public class SensorServiceImpl implements SensorService {
    @Autowired
    private SensorMapper sensorMapper;

    @Autowired
    private SensorItemMapper sensorItemMapper;

    @Override
    public List<Sensor> getSensor() {
        return sensorMapper.getSensor();
    }

    @Override
    public int getSensorTotal(){
        return sensorMapper.getSensorTotal();
    }

    @Override
    public List<Sensor> getSensorByOther(Sensor sensor) {
        return sensorMapper.getSensorByOther(sensor);
    }

    @Override
    public int getSensorByOtherTotal(Sensor sensor) {
        return sensorMapper.getSensorByOtherTotal(sensor);
    }

    @Override
    public int sensorAdd(Sensor sensor) {
        return sensorMapper.sensorAdd(sensor);
    }

    @Override
    public Sensor getSensorDetail(Sensor sensor) {
        return sensorMapper.getSensorDetail(sensor);
    }

    @Override
    public Sensor getSensorEdit(Sensor sensor) {
        return sensorMapper.getSensorEdit(sensor);
    }

    @Override
    public int sensorEdited(Sensor sensor) {
        return sensorMapper.sensorEdited(sensor);
    }

    @Override
    public int sensorDel(Sensor sensor) {
        return sensorMapper.sensorDel(sensor);
    }

    @Override
    public List<TreeVO> getTreeSensor(){
        List<TreeVO> treeVOList = new ArrayList<>();
        // 查询1
        List<Sensor> sensorList = sensorMapper.getSensor();
        // 查询2
        List<SensorItem> sensorItemList = sensorItemMapper.getItemList();
        for (int i = 0; i < sensorItemList.size(); i++) {
            SensorItem sensorItem = sensorItemList.get(i);
            TreeVO treeVO = new TreeVO();
            treeVO.setTitle(sensorItem.getItemName());
            String tempStr = i+"";
            treeVO.setValue(tempStr);
            treeVO.setKey(tempStr);
            List<TreeVO> childList = new ArrayList<>();

            int itemId = sensorItem.getItemId();
            for (int j = 0; j < sensorList.size(); j++) {
                tempStr = i+"";
                Sensor sensor = sensorList.get(j);
                if ( itemId == sensor.getSensorItemId()){
                    TreeVO child = new TreeVO();
                    child.setTitle(sensor.getSensorName());
                    tempStr += "-"+j;
                    child.setValue(tempStr);
                    child.setKey(tempStr);
                    //child.setChildren(null);
                    childList.add(child);
                }
            }

            treeVO.setChildren(childList);
            treeVOList.add(treeVO);
        }

        return treeVOList;
    }

}
