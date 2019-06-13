package com.sg.personalweb.article.domain;

import com.sg.personalweb.common.domain.common.basedomain.BaseDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 标签实体
 * @Author ShGuan
 * @Date 2019/6/13 17:41
 **/
@Data
@Entity
@Table(name = "LABEL")
public class Label extends BaseDomain{

    /**
     * 名称
     */
    private String name;
}