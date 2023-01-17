package com.chenwen.springbootbase.exception;

/**
 * @author chen.jw
 * @date 2021/7/14 11:39
 */
public class BaseException extends Exception{
    private int code;

    /**
     * 重写 fillInStackTrace
     */
    @Override
    public Throwable fillInStackTrace(){
        return this;
    }


}
