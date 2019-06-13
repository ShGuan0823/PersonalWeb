package com.sg.personalweb.common.util;

import com.sg.personalweb.common.domain.common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 操作树形结构的工具类
 * @Author ShGuan
 * @Date 2019/6/13 1:25
 **/
public class TreeTools<T extends TreeNode> {

    private List<T> rawTreeNodeList;

    private List<T> treeNodeList = new ArrayList<>();

    public List<T> getTreeList(List<T> rawTreeNodeList) {
        this.rawTreeNodeList = rawTreeNodeList;
        for (T treeNode : rawTreeNodeList) {
            // 判断是否是最顶级节点
            boolean flagOfRootNode = "0".equals(treeNode.getParentId())
                    || Tools.isEmpty(treeNode.getParentId());
            if (flagOfRootNode) {
                treeNodeList.add(getNewTreeNode(treeNode));
            }
        }
        return treeNodeList;
    }

    private List<T> getChildren(String id) {
        List<T> children = new ArrayList<>();
        for (T treeNode : rawTreeNodeList) {
            if (!Tools.isEmpty(treeNode.getParentId())) {
                if (id.equals(treeNode.getParentId())) {
                    children.add(getNewTreeNode(treeNode));
                }
            }
        }
        return children;
    }

    private T getNewTreeNode(T treeNode) {
        treeNode.setChildren(getChildren(treeNode.getId()));
        return treeNode;
    }

}
