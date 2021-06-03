package com.march;

import com.ListNode;

/**
 * Created by daixn on 2021/3/14 22:07
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1:
 *
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 示例 2:
 *
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3
 *
 * 1 2  3 4 5 6 7
 * 1 7 2 6 3 5 4
 *
 */
public class Day27 {

    public static void main(String[] args) {

    }

    /**
     * 寻找链表中点 + 链表逆序 + 合并链表
     * @param head
     */
    public void reorderList(ListNode head) {
        if(head==null){
            return ;
        }
        //后半部分链表
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        slow=temp;

        //链表反转
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        //System.out.println(prev);
        //链表合并
        ListNode node=head;
        while(node!=null && prev!=null){
            ListNode n1=node.next;
            ListNode n2=prev.next;
            prev.next=n1;
            node.next=prev;
            node=n1;
            prev=n2;
        }
    }
}
