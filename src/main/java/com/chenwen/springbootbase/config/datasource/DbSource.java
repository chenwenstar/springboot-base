package com.chenwen.springbootbase.config.datasource;

import java.lang.annotation.*;

/**
 * 动态注解
 * @author chen.jw
 * @date 2023/1/17 16:15
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DbSource {
    /**
     * 数据源key值
     */
    String value();
}
