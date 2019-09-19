package com.duck.javadesignmodel.Junit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.duck.javadesignmodel.common.Result;
import com.duck.javadesignmodel.common.ResultUtils;

import java.util.HashMap;
import java.util.Map;

/**
 *  测试类
 */
public class Test {


    public static void main(String[] args) {

        Map<String,Object> map = new HashMap<>();
        map.put("name","张三");

        Result result = ResultUtils.success("fadfad");


        String st = JSON.toJSONString(result);

        System.out.println(st);
    }
}
