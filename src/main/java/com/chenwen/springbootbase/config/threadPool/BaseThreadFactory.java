package com.chenwen.springbootbase.config.threadPool;

import io.netty.util.concurrent.DefaultThreadFactory;

/**
 * @author chen.jw
 * @date 2021/7/14 18:25
 */
public class BaseThreadFactory extends DefaultThreadFactory {

    public BaseThreadFactory(String poolName) {
        super(poolName);
    }
}
