package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午8:58 2020/7/6
 * @Modify:
 * @Description: leetcode 104
 */

public class LeetCode_104 {
    public int maxDepth(TreeNode root) {
        int maxDepth=0;
        if(null==root){
            return maxDepth;
        }else if(null==root.left && null==root.right){
            return maxDepth+1;
        }else{
            maxDepth+=1;
            int maxLeft=maxDepth(root.left);
            int maxRight=maxDepth(root.right);
            if(maxLeft>maxRight){
                return maxDepth+maxLeft;
            }else{
                return maxDepth+maxRight;
            }
        }
    }
}
