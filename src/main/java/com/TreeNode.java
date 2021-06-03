package com;

/**
 * Created by daixn on 2021/3/1 21:23
 * Definition for a binary tree node.
 */
public class TreeNode {
    public int val;
      public TreeNode left;
      public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    public TreeNode(int val) { this.val = val; }
}
