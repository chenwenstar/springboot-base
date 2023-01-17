package com.chenwen.springbootbase.config.threadPool;


import java.util.concurrent.ThreadFactory;

/**
 * @author chen.jw
 * @date 2021/7/14 18:25
 */
public class BaseThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}
