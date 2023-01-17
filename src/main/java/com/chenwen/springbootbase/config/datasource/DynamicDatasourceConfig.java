package com.chenwen.springbootbase.config.datasource;

import com.chenwen.springbootbase.config.datasource.properties.GoodsDataSourceProperties;
import com.chenwen.springbootbase.config.datasource.properties.TradeDataSourceProperties;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author chen.jw
 * @date 2023/1/17 15:29
 */
@Configuration
public class DynamicDatasourceConfig {


    @Bean("trade")
    public DataSource tradeDataSource(TradeDataSourceProperties dataSourceProperties) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dataSourceProperties.getUrl());
        config.setMaximumPoolSize(dataSourceProperties.getMaximumPoolSize());
        config.setMinimumIdle(dataSourceProperties.getMinimumIdle());
        config.setUsername(dataSourceProperties.getUsername());
        config.setPassword(dataSourceProperties.getPwd());
        config.setAutoCommit(true);
        return new HikariDataSource(config);
    }

    @Bean("goods")
    public DataSource goodsDataSource(GoodsDataSourceProperties dataSourceProperties) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dataSourceProperties.getUrl());
        config.setMaximumPoolSize(dataSourceProperties.getMaximumPoolSize());
        config.setMinimumIdle(dataSourceProperties.getMinimumIdle());
        config.setUsername(dataSourceProperties.getUsername());
        config.setPassword(dataSourceProperties.getPwd());
        config.setAutoCommit(true);
        return new HikariDataSource(config);
    }


}
