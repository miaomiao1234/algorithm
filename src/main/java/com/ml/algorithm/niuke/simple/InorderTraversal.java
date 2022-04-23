package com.ml.algorithm.niuke.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author miaoliang
 * @since 4/23/22 10:32 PM
 *
 *  中序遍历
 *  简单来说就是 左，根，右
 */
public class InorderTraversal {

    public int[] inorderTraversal (TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

}


