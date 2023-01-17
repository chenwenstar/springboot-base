package com.chenwen.springbootbase.exception;

import com.chenwen.springbootbase.entity.vo.ResultResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chen.jw
 * @date 2021/7/14 11:38
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler(BaseException.class)
    public ResultResponse<String> exception(BaseException e) {
        ResultResponse<String> response = new ResultResponse<>();
        response.setMsg(e.getMessage());
        response.setCode(0);
        return response;
    }
}
