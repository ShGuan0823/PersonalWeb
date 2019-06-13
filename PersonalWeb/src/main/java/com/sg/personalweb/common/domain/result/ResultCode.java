package com.sg.personalweb.common.domain.result;

/**
 * @Description 响应状态码
 * @Author ShGuan
 * @Date 2019/6/12 22:33
 **/
public enum  ResultCode {

    /**
     * 就两个状态，方便前后端交互
     */
    SUCCESS(2000),

    FAIL(5000);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}