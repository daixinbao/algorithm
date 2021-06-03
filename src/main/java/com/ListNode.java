package com;

/**
 * Created by daixn on 2021/2/18 23:29
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode setNext(ListNode next){
        this.next=next;
        return this.next;
    }
    public ListNode setNext(int next){
        this.next=new ListNode(next);
        return this.next;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode node=this;
        StringBuffer sb = new StringBuffer();
        while (node!=null){
            sb.append(node.val);
            if(node.next!=null){
                sb.append("->");
            }
            node=node.next;
        }
        return sb.toString();
    }
}