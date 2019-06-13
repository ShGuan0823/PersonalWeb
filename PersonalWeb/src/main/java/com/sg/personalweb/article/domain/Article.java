package com.sg.personalweb.article.domain;

import com.sg.personalweb.common.domain.common.basedomain.BaseDomain;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Description 文章实体
 * @Author ShGuan
 * @Date 2019/6/13 1:11
 **/
@Data
@Entity
@Table(name = "ARTICLE")
public class Article extends BaseDomain{

    /**
     * 作者
     */
    private String author;

    /**
     * 标题
     */
    private String title;

//    /**
//     * 标签
//     */
//    @OneToMany(mappedBy = "label")
//    @JoinColumn
//    private List<Label> labelList;

    /**
     *  阅读量
     */
    private String readNum;

    /**
     * 收藏数
     */
    private String collectNum;

    /**
     * 点赞数
     */
    private String likeNum;

    /**
     * 评论数
     */
    private String commentNum;

    /**
     * 类别id
     */
    private String categoryId;

    /**
     * 内容
     */
    private String content;

    /**
     * 时间
     */
    private Date date;

    /**
     * 展示优先级
     */
    private Integer orderNum;

}