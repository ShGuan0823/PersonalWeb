package com.sg.personalweb.common.domain.common.tree;

import com.sg.personalweb.common.domain.common.basedomain.BaseDomain;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 树形结构节点实体
 * @Author ShGuan
 * @Date 2019/6/13 1:23
 **/
@Data
public class TreeNode<T extends TreeNode> extends BaseDomain {

    /**
     * 根节点id
     */
    private String rootId;

    /**
     * 双亲节点id
     */
    private String parentId;

    /**
     * 子节点
     */
    private List<T> children = new ArrayList<>();

    /**
     * 节点序号
     */
    private Integer orderNum;

}