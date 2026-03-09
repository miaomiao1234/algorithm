package com.ml.algorithm.reversechain;

import ch.qos.logback.core.status.Status;
import lombok.Data;

import java.util.List;

import static ch.qos.logback.core.util.StatusPrinter.print;

/**
 * @author miaoliang
 * @since 2026/3/9 11:05
 * 链表翻转
 */
@Data
public class ReverseChain {

    @Data
    static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public ListNode next() {
            return next;
        }
    }

    private static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;

        while (null != curr) {
            ListNode next = curr.next; // 暂存下一节点
            curr.next = pre;   // 翻转指针
            pre = curr;  // pre 前进
            curr = next; // curr 前进
        }
        return pre;
    }

    public static void main(String[] args) {
        // 构建 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("原链表：");
        System.out.println(head);
        head = reverseList(head);
        System.out.print("反转后：");
        System.out.println(head);
    }


}
