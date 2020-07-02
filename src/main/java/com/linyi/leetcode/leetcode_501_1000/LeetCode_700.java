package com.linyi.leetcode.leetcode_501_1000;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午9:45 2020/7/1
 * @Modify:
 * @Description: leetcode 700
 */
public class LeetCode_700 {
    public TreeNode searchBST(TreeNode root, int val){
        if(null==root){
            return null;
        }
        if(root.val==val){
            return root;
        }else{
            if(root.val<val){
                return searchBST(root.right,val);
            }else{
                return searchBST(root.left,val);
            }
        }
    }
}
