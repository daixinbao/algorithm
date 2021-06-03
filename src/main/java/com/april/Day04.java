package com.april;

import com.TreeNode;

/**
 * Created by daixn on 2021/4/5 21:45
 */
public class Day04 {


    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(root.left == null || root.right == null) return left + right + 1;
        return Math.min(left,right)+1;
    }

    /*public boolean isBalanced(TreeNode root){
        return height(root)>=0;
    }
    public int height(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (left==-1 ||right==-1 ||Math.abs(left-right)>1){
            return -1;
        }else {
            return Math.max(left,right);
        }
    }*/
}
