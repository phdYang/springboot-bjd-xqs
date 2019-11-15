package com.bjd515.bjdxqs.service.impl;

import com.bjd515.bjdxqs.dto.PredictDTO;
import com.bjd515.bjdxqs.service.PredictService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: zhaoyang
 * Date: 2019/8/20
 * Time: 19:15
 * Description: No Description
 */

@Service
public class PredictServiceImpl implements PredictService {


    @Override
    public List getPredictData(PredictDTO params) {
        List rs = new ArrayList();
        // 1.1 处理sensorItemid
        List<String> sensorItemId = params.getSensorItemId();
        // 1.2 处理时间问题
        // 1.2.1 参数是1或者7
        // 1.3 保存模型 获得的是在路径下的地址D:/XXX/XXX/modelSave/xxxx.xx


        // 2.1 根据时间，sID 得到 之前七天的数据 作为模型的输入数据
        // 2.2 根据模型路径拿到模型，并调用模型；如 python xxx.py inputdir outputdir

        // 3.1 根据路径拿到返回数据，每个文件里存放的是同一个sID的数据
        // 3.2 返回上级的是 {sName:[时间，数据]}

        return null;
    }
}
