package com.march;

import com.ListNode;

/**
 * Created by daixn on 2021/3/1 20:30
 */
public class Day12 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        node1.setNext(1).setNext(2).setNext(3).setNext(4).setNext(5);

        ListNode node2 = new ListNode(1000000);
        node2.setNext(1000001).setNext(1000002).setNext(1000003).setNext(1000004);
        System.out.println(mergeInBetween(node1,1,1,node2));

    }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode tail=null;
        ListNode node1=list1;
        ListNode node2=list2;
        while(node2!=null ){
            tail=node2;
            node2=node2.next;
        }
        ListNode prev=null;
        ListNode after=null;
        while(b>=0){
            if(a==0){
                after=prev;
            }
            b--;
            a--;
            prev=node1;
            node1=node1.next;
        }
        tail.next=node1==null?null:node1;
        if(after!=null){
            after.next=list2;
        }else {
            return list2;
        }

        return list1;
    }
}
