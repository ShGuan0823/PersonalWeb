package com.sg.personalweb.common.domain.result;

/**
 * @Description 响应结果
 * @Author ShGuan
 * @Date 2019/6/12 22:33
 **/
public class Result<T> {

    /**
     * 状态码
     */
    private int code;

    /**
     * 前端提示的消息
     */
    private String message;

    /**
     * 详细的消息，隐藏不提示，仅用来快速查看问题使用
     */
    private String detail;

    private T data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public Result setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }
}