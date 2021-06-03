package com.april;

import java.util.*;

/**
 * Created by daixn on 2021/4/20 21:41
 */
public class Day20 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement2(new int[]{2,4},new int[]{1,2,3,4})));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1 == null) {
            return null;
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int numi=nums1[i];
            result[i]=-1;
            int index=-1;
            for (int i1 = 0; i1 < nums2.length; i1++) {
                if(numi==nums2[i1]){
                    index=i1;
                }
                if(index!=-1 && nums2[i1]>numi){
                    result[i]=nums2[i1];
                    break;
                }
            }
        }
        return result;
    }
    public static int[] nextGreaterElement2(int[] nums1, int[] nums2){
        int len1 = nums1.length;
        int len2 = nums2.length;
        Deque<Integer> stack=new LinkedList<Integer>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i < len2; i++) {
            while (!stack.isEmpty() && stack.peek()<nums2[i]){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int[] result = new int[len1];
        for (int i = 0; i < len1; i++) {
            result[i]=map.getOrDefault(nums1[i],-1);
        }
        return result;
    }

}
