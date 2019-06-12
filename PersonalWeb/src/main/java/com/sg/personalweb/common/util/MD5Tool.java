package com.sg.personalweb.common.util;

import com.sg.personalweb.common.constants.SymbolConstants;
import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

/**
 * @Description MD5
 * @Author ShGuan
 * @Date 2019/6/12 21:30
 **/
public class MD5Tool {

    private static final Logger logger = LoggerFactory.getLogger(MD5Tool.class);

    public final static String str2Md5(String s) {
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            String message = "字符串转MD5出现异常！";
            logger.error(message + SymbolConstants.SYMBOL_SHORT_BAR + e.getMessage(), e);
            throw new ServiceException(message);
        }
    }
}