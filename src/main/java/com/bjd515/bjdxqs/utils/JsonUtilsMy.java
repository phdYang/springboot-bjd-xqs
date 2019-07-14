package com.bjd515.bjdxqs.utils;

import com.alibaba.fastjson.JSONObject;

public class JsonUtilsMy {
    public static String packJson(int code, String msg, String result) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        jsonObject.put("result",result);
        return jsonObject.toJSONString();
    }
}
