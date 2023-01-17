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
public class GoodsDataSourceProperties implements DataSourceProperties{
    @Value("${datasource.goods.url}")
    private String url;
    @Value("${datasource.goods.maximumPoolSize}")
    private int maximumPoolSize;
    @Value("${datasource.goods.minimumIdle}")
    private int minimumIdle;
    @Value("${datasource.goods.username}")
    private String username;
    @Value("${datasource.goods.pwd}")
    private String pwd;
}
