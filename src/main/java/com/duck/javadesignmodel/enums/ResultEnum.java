package com.duck.javadesignmodel.enums;



public enum ResultEnum implements CodeMessage {
    SUCCESS(1,"接口调用成功"),

    FAIL(-1,"接口调用失败")
    ;


    private Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
