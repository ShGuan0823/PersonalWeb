package com.sg.personalweb.common.domain;

import com.sg.personalweb.common.constants.SystemConstants;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @Description 基础实体类
 * @Author ShGuan
 * @Date 2019/6/12 21:40
 **/

@MappedSuperclass
@Data
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
    private Date updateDate;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 实体备注
     */
    private String remarks;

    /**
     * 删除标记（0：正常；1：删除；2：审核）
     */
    private String flagOfRemove;

    /**
     * 添加之前执行方法，需要手动调用
     */
    public void preSave(){
        this.updateDate = new Date();
        this.createDate = this.updateDate;
    }

    /**
     * 更新之前执行方法，需要手动调用
     */
    public void preUpdate() {
        this.updateDate = new Date();
    }


}