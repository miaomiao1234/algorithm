package com.ml.algorithm.reversechain;

import lombok.Data;

/**
 * @author miaoliang
 * @since 2026/3/9 12:46
 */
@Data
public class NodeList {

    protected int val;

    protected NodeList next;

    public NodeList(int val) {
        this.val = val;
    }
}
