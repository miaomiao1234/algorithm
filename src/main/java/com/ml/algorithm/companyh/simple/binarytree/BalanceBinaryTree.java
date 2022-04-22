package com.ml.algorithm.companyh.simple.binarytree;

/**
 * @author miaoliang
 * @since 4/20/22 4:50 PM
 *
 * 问题描述：
 *  一棵树任意节点的左右两个子树不超过1认为是平衡二叉树
 *  如果判断一个树书否是平衡二叉树
 */
public class BalanceBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode = formateTreeNode(new String[]{"1", "2","3","4", "5","6",null,null,null, "8"}, 0);
        System.out.println(treeNode);
        boolean b = isBalenceTree(treeNode);
        System.out.println(b);
    }

    private static boolean isBalenceTree(TreeNode treeNode) {
        return height(treeNode) >= 0;
    }

    private static int height(TreeNode treeNode) {
        // 定义出口
        if (null == treeNode) {
            return 0;
        }
        int leftHeight = height(treeNode.getLeft());
        int rightHeight = height(treeNode.getRight());
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    private static TreeNode formateTreeNode(String[] array, int index) {
        TreeNode treeNode = null;
        // 定义出口
        if (array.length > index) {
            String value = array[index];
            if (null == value) {
                return null;
            }
            // 主要采用递归方式，每次都会生成一个 root根节点和 left，right 子节点
            // 同理，子节点创建 根节点并指定自己的子节点
            treeNode = new TreeNode(value);
            treeNode.setLeft(formateTreeNode(array, index*2+1));
            treeNode.setRight(formateTreeNode(array, index*2+2));
            return treeNode;
        }
        return treeNode;
    }

}
