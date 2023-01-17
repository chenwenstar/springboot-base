package com.chenwen.springbootbase.entity.vo;

import lombok.Data;

/**
 * @author chen.jw
 * @date 2023/1/5 15:30
 */
@Data
public class ResultResponse<T> {
    private T data;
    private int code;
    private String msg;
}
