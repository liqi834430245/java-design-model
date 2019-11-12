package com.duck.javadesignmodel.model1;

import org.springframework.util.CollectionUtils;

/**
 * 实例主题
 */
public class SubjectObject extends Subject {


    @Override
    public void sendMessage() {
        // 开始通知大家
        if (!CollectionUtils.isEmpty(observers)) {
            for(Observer observer : observers){
                observer.method2();
                observer.method1();
            }
        }

    }
}
