package com.sg.personalweb.common.util;

import java.util.List;
import java.util.UUID;

/**
 * @Description 通用工具类
 * @Author ShGuan
 * @Date 2019/6/12 21:26
 **/
public class Tools {

    /**
     * 生成uuid
     * @return
     */
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        // 去掉“-”符号
        return uuid.replaceAll("-", "");
    }


    /**
     * 判断对象为空
     *
     * @param obj 对象名
     * @return 是否为空
     */
    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if ((obj instanceof List)) {
            return ((List) obj).size() == 0;
        }
        if ((obj instanceof String)) {
            return ((String) obj).trim().equals("");
        }
        return false;
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }
}