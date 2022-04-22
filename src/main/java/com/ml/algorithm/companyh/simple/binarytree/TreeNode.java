package com.ml.algorithm.companyh.simple.binarytree;

/**
 * @author miaoliang
 * @since 4/20/22 4:59 PM
 */
public class TreeNode {

    public TreeNode(String val) {
        this.val = val;
    }

    private String val;

    private TreeNode left;

    private TreeNode right;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
