package com.march;

import com.ListNode;

/**
 * Created by daixn on 2021/3/14 18:41
 * 编写程序以 x 为基准分割链表，使得所有小于 x 的节点排在大于或等于 x 的节点之前。如果链表中包含 x，x 只需出现在小于 x 的元素之后(如下所示)。分割元素 x 只需处于“右半部分”即可，其不需要被置于左右两部分之间。
 *
 * 示例:
 *
 * 输入: head = 3->5->8->5->10->2->1, x = 5
 * 输出: 3->1->2->10->5->5->8
 *
 *
 */
public class Day26 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        node1.setNext(5).setNext(8).setNext(5).setNext(10).setNext(2).setNext(1);
        System.out.println(partition(node1,5));
    }
    public static ListNode partition(ListNode head, int x) {
        //
        ListNode smallHead=new ListNode(0);
        ListNode small=smallHead;
        ListNode largeHead=new ListNode(0);
        ListNode large=largeHead;
        ListNode node = head;
        while (node!=null){
            if(node.val<x){
                small.next=node;
                small=small.next;
            }else{
                large.next=node;
                large=large.next;
            }
            node=node.next;
        }
        large.next=null;
        small.next=largeHead.next;
        return smallHead.next;
    }
}
