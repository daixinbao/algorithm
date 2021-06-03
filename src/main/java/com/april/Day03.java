package com.april;

import com.TreeNode;

/**
 * Created by daixn on 2021/4/3 22:08
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 *
 */
public class Day03 {
    public static void main(String[] args) {

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums,int l,int r) {
        if(l>r ){
            return null;
        }
        int midx=(l+r)/2;
        TreeNode root=new TreeNode(nums[midx]);
        root.left=sortedArrayToBST(nums,l,midx-1);
        root.right=sortedArrayToBST(nums,midx+1,r);
        return root;
    }
}
