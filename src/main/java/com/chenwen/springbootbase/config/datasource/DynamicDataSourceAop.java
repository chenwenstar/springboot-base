package com.chenwen.springbootbase.config.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author chen.jw
 * @date 2023/1/17 16:29
 */

@Slf4j
@Aspect
@Component
public class DynamicDataSourceAop {
    @Pointcut("execution(* com.chenwen.springbootbase.controller.*(..))")
    protected void dbPointCut() {
    }

    @Before(value = "dbPointCut()")
    public void processDb(JoinPoint joinPoint) {

    }

    @Before("@within(dbSource)")
    public void switchDataSource(JoinPoint point, DbSource dbSource) {
        DbSourceContext.setDbSource(dbSource.value());
    }

}
