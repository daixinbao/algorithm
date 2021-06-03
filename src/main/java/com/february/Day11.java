package com.february;

import com.ListNode;

/**
 * Created by daixn on 2021/2/28 20:52
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 *
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 */
public class Day11 {
    private  int a=0;
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.setNext(2).setNext(3).setNext(4).setNext(5).setNext(6);
        //System.out.println(reverseBetween(head,1,5));
        Day11 day11 = new Day11();day11.test();


    }
    public void test(){
        for (int j = 0; j < 2; j++) {
            new Thread(()->{
                boolean isOdd=false;
                for (int i = 1; i <=2 ; i++) {
                    isOdd=i%2==1;
                    a+=i*(isOdd?1:-1);
                }
            }).start();
        }
        System.out.println(a);
    }
     public static ListNode reverseBetween(ListNode head, int left, int right) {
        int i=1;
        ListNode node=head;
        ListNode prev=null;
        ListNode nodepm=head;
        ListNode nodem=head;
        while (i<=right){
            ListNode next=node.next;
            if(i==left){
                nodepm=prev;
                nodem=node;
                node.next=null;
            }else if(i>left){
                node.next=prev;
            }
            i++;
            prev=node;
            node=next;
        }
         nodem.next=node;
        if(nodepm!=null){
            nodepm.next=prev;
        }else{
            return  prev;
        }

         return head;
    }
}
