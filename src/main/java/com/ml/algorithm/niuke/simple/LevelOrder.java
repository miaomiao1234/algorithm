package com.ml.algorithm.niuke.simple;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author miaoliang
 * @since 4/23/22 11:01 PM
 *
 *
 *  层序遍历
 *  一层一层遍历
 *  通过二维数组存储结构
 */
public class LevelOrder {

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // 如果 根节点为空，直接返回值
        if (root == null) return list;
        // 创建队列 存储 节点信息
        ArrayDeque<TreeNode> nodeList = new ArrayDeque<TreeNode>();
        nodeList.add(root);
        while(nodeList.size() > 0) {
            ArrayList<Integer> row = new ArrayList();
            int n = nodeList.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = nodeList.pop();
                row.add(node.val);
                if (node.left != null) nodeList.add(node.left);
                if (node.right != null) nodeList.add(node.right);
            }
            list.add(row);
        }
        return list;
    }

}
