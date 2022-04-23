package com.ml.algorithm.niuke.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author miaoliang
 * @since 4/23/22 10:32 PM
 *
 *  后序遍历
 *  简单来说就是 左，右， 根
 */
public class PostorderTraversal {

    public int[] postorderTraversal (TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private void postorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }

}


