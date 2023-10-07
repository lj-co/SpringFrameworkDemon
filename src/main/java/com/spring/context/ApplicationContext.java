package com.spring.context;

import com.spring.beans.factory.config.AutowireCapableBeanFactory;

/**
 * 应用上下文
 *
 * @author LJ
 * @version ApplicationContext.java, v 0.1 2023-10-07
 */
public interface ApplicationContext {

    /**
     * 返回应用名称
     *
     * @return 应用名称
     */
    String getApplicationName();

    /**
     * 获取具有自动注入功能的bean工厂
     *
     * @return 具有自动注入功能的bean工厂
     */
    AutowireCapableBeanFactory getAutowireCapableBeanFactory();
}
