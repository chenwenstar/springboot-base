package com.chenwen.springbootbase.config.datasource;

/**
 * 数据源上下文
 * @author chen.jw
 * @date 2023/1/17 15:34
 */
public class DbSourceContext {
    private static final ThreadLocal<String> DB_CONTEXT = new ThreadLocal<String>();

    public static void setDbSource(String source) {
        DB_CONTEXT.set(source);
    }

    public static String getDbSource() {
        return DB_CONTEXT.get();
    }

    public static void removeDbSource(String source){
        DB_CONTEXT.remove();
    }
}
