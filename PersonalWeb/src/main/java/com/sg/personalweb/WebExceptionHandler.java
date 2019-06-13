package com.sg.personalweb;

import com.sg.personalweb.common.manager.exceptionhandler.BaseExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 全局异常处理
 * @Author ShGuan
 * @Date 2019/6/13 18:36
 **/
@ControllerAdvice
@ResponseBody
public class WebExceptionHandler extends BaseExceptionHandler {

}