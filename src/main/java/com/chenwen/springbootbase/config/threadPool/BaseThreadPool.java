package com.chenwen.springbootbase.config.threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chen.jw
 * @date 2021/7/14 17:42
 */
public class BaseThreadPool {
    private static final int CORE_SIZE = 2;
    private static final int MAX_SIZE = 6;
    private static final String POOL_NAME = "modelName";
    private static ThreadPoolExecutor EXECUTOR = null;


    static ThreadPoolExecutor getPoolExecutor() {
        if (null == EXECUTOR) {
            synchronized (BaseThreadPool.class) {
                if (null == EXECUTOR) {
                    EXECUTOR = new ThreadPoolExecutor(CORE_SIZE, MAX_SIZE, 100, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(1000), new BaseThreadFactory(POOL_NAME));
                }
            }
        }
        return EXECUTOR;
    }

}
