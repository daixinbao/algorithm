package com.february;

import com.ListNode;

/**
 * Created by daixn on 2021/2/28 20:52
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * 1->2->3->3->4->4->5
 */
public class Day08 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.setNext(1).setNext(1).setNext(1).setNext(3).setNext(4).setNext(5).setNext(6).setNext(6);;
        System.out.println(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode node=dummy;
        ListNode prvDuplicates=null;
        while(node.next!=null){
            ListNode node1=node.next;
            ListNode node2 = node.next.next;
            if((prvDuplicates!=null&&prvDuplicates.val==node1.val)){
                node.next=node2;
                continue;
            }

            if(node2!=null && node1.val==node2.val ){
                node.next=node2.next;
                prvDuplicates=node1;
            }else{
                node=node.next;
            }
        }
        return dummy.next;
    }
}
