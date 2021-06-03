package com.march;

import com.ListNode;

import java.util.Arrays;

/**
 * Created by daixn on 2021/3/15 21:42
 */
public class Day28 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        node1.setNext(1).setNext(2).setNext(3).setNext(4).setNext(5).setNext(6).setNext(7).setNext(8).setNext(9);
        ListNode[] listNodes = splitListToParts(node1, 6);
        Arrays.stream(listNodes).forEach(c-> System.out.println(c));
    }
    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode cur = root;
        int N = 0;
        while (cur != null) {
            cur = cur.next;
            N++;
        }

        int width = N / k, rem = N % k;

        ListNode[] ans = new ListNode[k];
        cur = root;
        for (int i = 0; i < k; ++i) {
            ListNode head = cur;
            for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; ++j) {
                if (cur != null) cur = cur.next;
            }
            if (cur != null) {
                ListNode prev = cur;
                cur = cur.next;
                prev.next = null;
            }
            ans[i] = head;
        }
        return ans;

    }
}
