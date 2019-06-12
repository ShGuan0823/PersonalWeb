package com.sg.personalweb.common.util;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import java.rmi.ServerException;

import static com.sun.xml.internal.ws.api.message.Packet.State.ServerResponse;

/**
 * @Description 发送邮件工具
 * @Author ShGuan
 * @Date 2019/6/12 21:31
 **/
public class EmailTool {

    @Autowired
    private static JavaMailSender mailSender;

    @Autowired
    private static DefaultKaptcha kaptcha;

    public static String sendEmail(String To, String[] Cc, String[] Bcc) throws ServerException, MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        // 设置发送方
        helper.setFrom("shguan.qj@qq.com");
        // 接受方不能为空
        if (To == null){
            throw new ServerException("接收方不能为空");
        } else {
            // 设置接收方
            helper.setTo(To);
        }
        if (Cc != null){
            // 设置抄送
            helper.setCc(Cc);
        }
        if (Bcc != null){
            // 设置密抄
            helper.setBcc(Bcc);
        }
        // 设置主题
        helper.setSubject("主题：验证码测试");
        // 生成验证码
        String code = kaptcha.createText();
        // 设置内容
        message.setText("<h1>" + code + "<h1>", "utf-8", "html");
        // 发送
        mailSender.send(message);
        return code;
    }

}