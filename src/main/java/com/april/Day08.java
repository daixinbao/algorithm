package com.april;

import com.TreeNode;

/**
 * Created by daixn on 2021/4/8 18:43
 */
public class Day08 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if(p==null){
            return q;
        }
        if(q==null){
            return p;
        }
        return null;
    }
}
