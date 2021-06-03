package com.february;

import com.ListNode;

/**
 * Created by daixn on 2021/2/24 23:16
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class Day07 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.setNext(2).setNext(3).setNext(4).setNext(5).setNext(6);
        System.out.println(swapPairs(head));
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }
}
