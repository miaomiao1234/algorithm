package com.ml.algorithm.reversechain;

/**
 * @author miaoliang
 * @since 2026/3/9 12:17
 */
public class RecursionChain {

    public static NodeList reversList(NodeList head) {
        // 定义返回条件
        if (head == null || head.next == null) return head;
        // 递归翻转后续节点
        NodeList newHead = reversList(head.next);
        // 翻转指针
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        // 构建 1->2->3->4->5
        NodeList head = new NodeList(1);
        head.next = new NodeList(2);
        head.next.next = new NodeList(3);
        head.next.next.next = new NodeList(4);
        head.next.next.next.next = new NodeList(5);

        System.out.print("原链表：");
        System.out.println(head);
        head = reversList(head);
        System.out.print("反转后：");
        System.out.println(head);
    }

}
