package com.sg.personalweb.user.domain;

import com.sg.personalweb.common.domain.common.basedomain.BaseDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 帐号实体
 * @Author ShGuan
 * @Date 2019/6/12 22:19
 **/
@Data
@Entity
@Table(name = "ACCOUNT")
public class Account extends BaseDomain{

    /**
     * 帐号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;
}