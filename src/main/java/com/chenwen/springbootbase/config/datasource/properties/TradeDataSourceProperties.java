package com.chenwen.springbootbase.config.datasource.properties;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author chen.jw
 * @date 2023/1/17 15:48
 */
@Configuration
@Data
public class TradeDataSourceProperties implements DataSourceProperties{
    @Value("${datasource.trade.url}")
    private String url;
    @Value("${datasource.trade.maximumPoolSize}")
    private int maximumPoolSize;
    @Value("${datasource.trade.minimumIdle}")
    private int minimumIdle;
    @Value("${datasource.trade.username}")
    private String username;
    @Value("${datasource.trade.pwd}")
    private String pwd;
}
