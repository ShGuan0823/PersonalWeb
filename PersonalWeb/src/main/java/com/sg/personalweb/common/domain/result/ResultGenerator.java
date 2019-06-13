package com.sg.personalweb.common.domain.result;

/**
 * 响应结果生成工具
 * @Author ShGuan
 * @Date 2019/6/12 22:33
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult(Object data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result genFailResult(int code, String message) {
        return new Result()
                .setCode(code)
                .setMessage(message);
    }

    public static Result genFailResult(int code, String message, String detail) {
        return new Result()
                .setCode(code)
                .setMessage(message)
                .setDetail(detail);
    }

}
