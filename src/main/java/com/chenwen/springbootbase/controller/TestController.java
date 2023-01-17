package com.chenwen.springbootbase.controller;

import com.chenwen.springbootbase.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chen.jw
 * @date 2022/12/22 15:51
 */
@RestController
@Slf4j
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/test")
    public void test() {
        log.info("入口");
        testService.test();
    }
}
