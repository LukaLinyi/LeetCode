package com.linyi.leetcode.leetcode_501_1000;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午6:02 2020/6/29
 * @Modify:
 * @Description: leetCode 617
 * @题目：
 *      合并二叉树
 * @思路：递归
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class LeetCode_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(null==t1 && null==t2){
            return null;
        }else if(null==t2){
            return t1;
        }else if(null==t1){
            return t2;
        }else{
            t1.val+=t2.val;
            t1.left=mergeTrees(t1.left,t2.left);
            t1.right=mergeTrees(t1.right,t2.right);
            return t1;
        }
    }
}
