package com.march;

import com.ListNode;

/**
 * Created by daixn on 2021/3/14 16:21
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 *
 * 进阶：
 *
 * 你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
 *
 */
public class Day25 {
    public static void main(String[] args) {
        //使用分治算法 归并排序
        ListNode node1 = new ListNode(-1);
        node1.setNext(1).setNext(3).setNext(5).setNext(7).setNext(9).setNext(2).setNext(4).setNext(6);

        ListNode node2 = new ListNode(0);
        node2.setNext(2).setNext(4).setNext(6);

        Day25 day25 = new Day25();
        System.out.println(day25.sortList2(node1));
    }
    public ListNode sortList2(ListNode head) {
        if(head==null){
            return null;
        }
        //获取链表长度
        ListNode curNode=head;
        int len=0;
        while (curNode!=null){
            len++;
            curNode=curNode.next;
        }
        ListNode dummyNode = new ListNode(0, head);
        for (int subLen = 1; subLen < len; subLen<<=1) {
            ListNode prev=dummyNode;
            curNode=dummyNode.next;
            while (curNode!=null){
                ListNode head1=curNode;
                for (int i=1;i<subLen && curNode.next!=null;i++){
                    curNode=curNode.next;
                }
                ListNode head2 = curNode.next;
                curNode.next=null;
                curNode =head2;
                for (int i=1;i<subLen && curNode!=null &&curNode.next!=null;i++){
                    curNode=curNode.next;
                }
                //ListNode next=null;
                if(curNode!=null){
                    ListNode next= curNode.next;
                    curNode.next=null;
                    curNode=next;
                }
                ListNode merge = merge(head1, head2);
                prev.next=merge;
                while (prev.next != null) {
                    prev = prev.next;
                }

            }
        }
        return dummyNode.next;
    }
    public ListNode sortList(ListNode head) {
      return sortList(head,null);
    }
    private ListNode sortList(ListNode head,ListNode tail) {
        if(head==null) return null;
        if(head.next==tail){
            head.next=null;
            return head;
        }
        ListNode slow = head, fast = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode node1=sortList(head,mid);
        ListNode node2=sortList(mid,tail);
        return merge(node1,node2);
    }
    //合并两个有序链表
    private  ListNode merge(ListNode head1,ListNode head2){
        if(head1 ==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ListNode node1 = head1;
        ListNode node2 = head2;
        ListNode dummyNode = new ListNode(0);
        ListNode curNode=dummyNode;
        while (node1!=null && node2!=null){
            if(node1.val>node2.val){
                curNode.next=node2;
                node2=node2.next;
            }else{
                curNode.next=node1;
                node1=node1.next;
            }
            curNode=curNode.next;
        }
        curNode.next=node1==null?node2:node1;
        return dummyNode.next;
    }
}
