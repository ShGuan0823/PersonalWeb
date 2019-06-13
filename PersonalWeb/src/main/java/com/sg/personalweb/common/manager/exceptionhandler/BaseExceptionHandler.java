package com.sg.personalweb.common.manager.exceptionhandler;

import com.sg.personalweb.common.domain.result.Result;
import com.sg.personalweb.common.domain.result.ResultCode;
import com.sg.personalweb.common.domain.result.ResultGenerator;
import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description 全局异常捕捉基类
 * @Author ShGuan
 * @Date 2019/6/13 18:25
 **/
public abstract class BaseExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    @ExceptionHandler
    public Result serviceException(ServiceException e) {
        logger.error("服务异常", e);
        return ResultGenerator.genFailResult(ResultCode.FAIL.code, e.getMessage());
    }

    @ExceptionHandler
    public Result unknownException(Exception e) {
        logger.error("发生了未知异常", e);
        // 发送邮件通知技术人员.
        return ResultGenerator.genFailResult(ResultCode.FAIL.code, "系统出现错误，请联系网站管理员!", e.getMessage());
    }
}