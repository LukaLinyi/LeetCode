package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:11 2020/7/1
 * @Modify:
 * @Description: leetcode 226
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class LeetCode_226 {
    public TreeNode invertTree(TreeNode root){
        if(null==root.left && null==root.right){
            return root;
        }else{
            TreeNode tmpNode=null;
            tmpNode=root.left;
            root.left=root.right;
            root.right=tmpNode;
            root.left=invertTree(root.left);
            root.right=invertTree(root.right);
            return root;
        }
    }
}
