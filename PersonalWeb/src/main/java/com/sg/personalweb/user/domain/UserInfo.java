package com.sg.personalweb.user.domain;

import com.sg.personalweb.common.domain.common.basedomain.BaseDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 用户信息实体
 * @Author ShGuan
 * @Date 2019/6/12 22:19
 **/
@Data
@Entity
@Table(name = "USER_INFO")
public class UserInfo extends BaseDomain {

    /**
     * 账号id
     */
    private String accountId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 年龄
     */
    private String age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 头像地址
     */
    private String icon;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 公司
     */
    private String company;

    /**
     * 学校
     */
    private String school;

    /**
     * 地址
     */
    private String address;

    /**
     * 简介
     */
    private String introduction;
}