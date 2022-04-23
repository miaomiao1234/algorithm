package com.ml.algorithm.niuke.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author miaoliang
 * @since 4/23/22 10:19 PM
 *
 * 二叉树前序遍历
 *  简单来说就是 根，左，右
 *  先遍历根节点
 *  再遍历 left 节点
 *  再遍历 right 节点
 *  将结果放到数组中
 *
 */
public class PreorderTraversal {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] preorderTraversal (TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        preorder(list, root);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private void preorder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preorder(list, root.left);
        preorder(list, root.right);
    }


}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
