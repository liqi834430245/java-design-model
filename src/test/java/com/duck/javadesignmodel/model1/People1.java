package com.duck.javadesignmodel.model1;

public class People1 implements Observer {
    @Override
    public void method1() {
        System.out.println(People1.class.getName()+" 我的method已经收到通知");
    }

    @Override
    public void method2() {
        System.out.println(People1.class.getName()+" 我的method2已经收到通知");
    }
}
