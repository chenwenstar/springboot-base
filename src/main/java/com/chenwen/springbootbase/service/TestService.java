package com.chenwen.springbootbase.service;

import com.chenwen.springbootbase.config.threadPool.BaseThreadPool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author chen.jw
 * @date 2022/12/22 15:54
 */
@Service
@Slf4j
public class TestService {
    public void test(){
        ThreadPoolExecutor poolExecutor = BaseThreadPool.getPoolExecutor();
        poolExecutor.execute(()-> {
            log.info("开始");
            log.info("结束");
        });
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
