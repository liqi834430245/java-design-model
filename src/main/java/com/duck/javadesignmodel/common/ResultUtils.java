package com.duck.javadesignmodel.common;

import com.duck.javadesignmodel.enums.ResultEnum;

import java.util.HashMap;
import java.util.Map;

/**
 *  定义一个公共的返回结果集
 */
public class ResultUtils {


    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        check(result,object);
        return result;
    }

    /**
     * success 无返回值
     *
     * @return com.duck.javadesignmodel.common.Result
     */
    public static Result success(){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        return result;
    }

    /**
     * 检查是不是map
     */
    private static void check(Result result, Object obj){

        Map<String,Object> map = new HashMap<>();

        if (obj instanceof String){
            map.put("result",obj);
            result.setData(map);
            return;
        }

        try {
            boolean type = ((Class<?>) obj.getClass().getField("TYPE").get(null)).isPrimitive();
           if (type){
               map.put("result",obj);
               result.setData(map);
           }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        result.setData(obj);
    }


}
