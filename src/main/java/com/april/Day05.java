package com.april;

import com.TreeNode;

/**
 * Created by daixn on 2021/4/5 20:43
 */
public class Day05 {
    public static void main(String[] args) {

    }
    public boolean isBalanced(TreeNode root) {
            return getHeight(root)>=0;
    }
      private int getHeight(TreeNode root){
          if (root == null) {
              return 0;
          }
          int leftHight = getHeight(root.left);
          int rightHight = getHeight(root.right);
          if(leftHight==-1 || rightHight==-1 || Math.abs(leftHight - rightHight) > 1){
              return -1;
          }else {
              return Math.max(leftHight, rightHight) + 1;
          }
      }
}
