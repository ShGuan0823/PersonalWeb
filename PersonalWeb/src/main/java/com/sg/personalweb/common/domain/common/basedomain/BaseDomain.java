package com.sg.personalweb.common.domain.common.basedomain;

import com.sg.personalweb.common.constants.SystemConstants;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @Description 基础实体类
 * @Author ShGuan
 * @Date 2019/6/12 21:40
 **/
@Data
@MappedSuperclass
public class BaseDomain {

    private static final long serialVersionUID = SystemConstants.SERIAL_VERSION_UID;

    /**
     * 记录的id
     */
    @Id
    private String id;
    public static final String ID = "_id";

    /**
     * 实体创建日期
     */
    private Date createDate;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 实体最新更新日期
     */
    private Date modifyDate;

    /**
     * 更新者
     */
    private String modifyBy;

    /**
     * 实体备注
     */
    private String remarks;

    /**
     * 删除标记（0：正常；1：删除；2：审核）
     */
    private String state;

    /**
     * 添加之前执行方法，需要手动调用
     */
    public void preSave(){
        this.createDate = new Date();
        this.modifyDate = this.createDate;
    }

    /**
     * 更新之前执行方法，需要手动调用
     */
    public void preUpdate() {
        this.modifyDate = new Date();
    }


}