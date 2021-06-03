package com.february;

import com.ListNode;

/**
 * Created by daixn on 2021/2/28 20:52
 * head = [1,4,3,2,5,2], x = 3
 * [1,2,2,4,3,5]
 */
public class Day10 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.setNext(4).setNext(3).setNext(2).setNext(5).setNext(2);
        System.out.println(partition(head,3));
    }

    public static ListNode partition2(ListNode head, int x) {
        ListNode  prev = new ListNode(0),  tag = new ListNode(0);
        ListNode p=prev,pTag=tag;
        prev.next = head;
        while (head!=null) {
            if (head.val >= x) {
                prev.next = head.next;
                tag = tag.next = head;
            } else {
                prev = head;
            }
            head = head.next;
        }
        tag.next = null;
        prev.next = pTag.next;
        return p.next;
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode node=head;
        ListNode node1=dummy1;
        ListNode node2=dummy2;
        while (node!=null){
            if(node.val<x){
                node1.next=node;
                node1=node1.next;
            }else{
                node2.next=node;
                node2=node2.next;
            }
            node=node.next;
        }
        node2.next=null;
        node1.next=dummy2.next;
        return dummy1.next;
    }
}
