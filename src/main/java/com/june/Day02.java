package com.june;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by daixn on 2021/6/2 20:52
 */
public class Day02 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))(("));
    }
    @Deprecated
    public static int minAddToMakeValid(String s) {
        int i1=0,i2=0;
        Deque<Character> stack=new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'&&stack.peek()=='('){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }

        }
        return stack.size();

    }
    public static int minAddToMakeValid2(String s) {
        int i1=0,i2=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                i1++;
            }else{
                if(i1==0){
                    i2++;
                }else{
                    i1--;
                }

            }

        }
        return i1+i2;

    }
}
