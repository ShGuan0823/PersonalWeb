package com.sg.personalweb.article.domain;

import com.sg.personalweb.common.domain.common.tree.TreeNode;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 文章类别实体
 * @Author ShGuan
 * @Date 2019/6/13 1:30
 **/
@Data
@Entity
@Table(name = "CATEGORY")
public class Category extends TreeNode {

    /**
     * 名称
     */
    private String name;
}