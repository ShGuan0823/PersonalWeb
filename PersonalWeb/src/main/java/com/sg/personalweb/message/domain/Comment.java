package com.sg.personalweb.message.domain;

import com.sg.personalweb.common.domain.common.basedomain.BaseDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * @Description 评论实体
 * @Author ShGuan
 * @Date 2019/6/13 0:30
 **/

@Data
@Entity
@Table(name = "COMMENT")
public class Comment extends BaseDomain {

    /**
     * 文章id
     */
    private String articleId;

    /**
     * 评论Id
     */
    private String commentId;

    /**
     * 评论者
     */
    private String sender;

    /**
     * 内容
     */
    private String content;

    /**
     * 时间
     */
    private Date date;

//    /**
//     * 回复
//     */
//    private List<Comment> replyList;

}