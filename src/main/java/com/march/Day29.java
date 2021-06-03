package com.march;

import com.ListNode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by daixn on 2021/3/16 21:02
 * 1,7,5,1,9,2,5,1
 */
public class Day29 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.setNext(7).setNext(5).setNext(1).setNext(9).setNext(2).setNext(5).setNext(1);
       /* ListNode node1 = new ListNode(2);
        node1.setNext(7).setNext(4).setNext(3).setNext(5);*/
        System.out.println(Arrays.toString(nextLargerNodes(node1)));
    }
    public static int[] nextLargerNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head,prev=null;
        int N = 0;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            N++;
        }
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[N];
        int index=N-1;
        while(prev!=null){
            while(!stack.isEmpty()&&prev.val>=stack.peek()){
                stack.pop();
            }
            res[index--]=stack.isEmpty()?0:stack.peek();
            stack.push(prev.val);
            prev=prev.next;
        }
        return res;
    }
}
