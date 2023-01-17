package com.chenwen.springbootbase.config.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author chen.jw
 * @date 2023/1/17 15:31
 */
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DbSourceContext.getDbSource();
    }
}
