package com.march;

import com.TreeNode;

/**
 * Created by daixn on 2021/3/29 14:40
 */
public class Day31 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
