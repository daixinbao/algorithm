package com.may;

import com.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by daixn on 2021/5/8 22:53
 */
public class Day08 {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack=new LinkedList<TreeNode>();
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                res.add(root.val);
                stack.push(root);
                root=root.left;
            }
            TreeNode pop = stack.pop();
            root=pop.right;
        }
        return res;
    }
}
