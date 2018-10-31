package com.spring.clone.bean;

public interface BeanFactory {

    Object getBean(String name);

    <T> T getBean(String name, Class<T> requiredType);

    <T> T getBean(Class<T> requiredType);
}
