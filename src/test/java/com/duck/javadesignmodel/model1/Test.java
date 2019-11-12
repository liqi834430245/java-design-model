package com.duck.javadesignmodel.model1;

/**
 *
 */
public class Test {

    public static void main(String[] args){

        System.out.println("----开始测试----");

        Subject peo1 = new SubjectObject();

        // 加入观察者
        Observer observer = new People1();
        peo1.add(observer);

        peo1.sendMessage();
    }
}
