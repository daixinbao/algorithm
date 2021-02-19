package com.february;

import com.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by daixn on 2021/2/18 23:25
 */
public class Day01 {
    public static void main(String[] args) {
        Integer I=10000; //s
        Integer i=10000;
        System.out.println(I.equals(i));
    }

    /**
     * 删除链表重复元素
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode node=head;
        Set<Integer> set=new HashSet<Integer>();
        set.add(head.val);
        while(node!=null ){
            if(node.next!=null&&set.contains(node.next.val)){
                node.next=node.next.next;
            }else{
                node=node.next;
                if(node!=null){
                    set.add(node.val);
                }
            }
        }
        return head;
    }
}



