package com.duck.javadesignmodel.model1;

import org.assertj.core.util.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * @author liqi
 *
 * 创建一个抽象主题
 */
public abstract class Subject {

    protected List<Observer> observers = Lists.newArrayList();


    /* 添加方法
     */
    public void add(Observer observer) {
        if (Objects.nonNull(observer)) {
            observers.add(observer);
        }
    }

    /* 移除数据
     */
    public void remove(Observer observer) {
        if (!CollectionUtils.isEmpty(observers)) {
            observers.remove(observer);
        }
    }

    // 定义抽象发送方法
    public abstract void sendMessage();
}
