package com.chenwen.springbootbase.config.datasource;

/**
 * @author chen.jw
 * @date 2023/1/17 16:19
 */
public enum DataSourceEnum {
    TRADE("trade"), GOODS("goods");
    private final String code;

    DataSourceEnum(String code) {
        this.code = code;
    }
}
