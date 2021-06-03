package com.april;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by daixn on 2021/4/12 21:46
 */
class MyQueue {
    Deque<Integer> d1;
    Deque<Integer> d2;
    /** Initialize your data structure here. */
    public MyQueue() {
        d1=new LinkedList<Integer>();
        d2=new LinkedList<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        d1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(d2.isEmpty()){
            while (!d1.isEmpty()){
                d2.push(d1.pop());
            }
        }
        return d2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(d2.isEmpty()){
            while (!d1.isEmpty()){
                d2.push(d1.pop());
            }
        }
        return d2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return d1.isEmpty()&&d2.isEmpty();
    }
}
public class Day12 {
    public static void main(String[] args) {

    }
}
