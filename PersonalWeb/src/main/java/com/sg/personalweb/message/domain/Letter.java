package com.sg.personalweb.message.domain;

import com.sg.personalweb.common.domain.common.basedomain.BaseDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Description 私信实体
 * @Author ShGuan
 * @Date 2019/6/13 0:30
 **/
@Data
@Entity
@Table(name = "LETTER")
public class Letter extends BaseDomain{

    /**
     * 发送方
     */
    private String sender;

    /**
     * 接受方
     */
    private String recevier;

    /**
     * 时间
     */
    private Date date;

    /**
     * 内容
     */
    private String content;

}