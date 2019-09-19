package com.duck.javadesignmodel.common;


/**
 *  @author jack-liqi
 *
 *  定义一个返回值 实体类
 */
public class Result<T> {

    /**
     * 返回code
     */
    private int code;


    /**
     * 返回信息
     */
    private String msg;


    /**
     * 返回的T结果值
     */
    private T data;

    public Result(){}

    /**
     * 构造方法复制
     * @param obj
     */
    public Result(T obj){
        this.data = obj;
    }

    public Result(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Result(int code,String msg,T obj){
        this.code = code;
        this.msg = msg;
        this.data = obj;
    }



    /*
    * 生成set and get方法
    * */
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
