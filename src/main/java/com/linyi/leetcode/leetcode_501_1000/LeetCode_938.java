package com.linyi.leetcode.leetcode_501_1000;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午6:58 2020/6/29
 * @Modify:
 * @Description: leetcode 938
 * @思路：递归实现深度优先遍历
 */
public class LeetCode_938 {
    public int rangeSumBST(TreeNode root, int L, int R){
        int sum=0;
        if(null==root){
            return sum;
        }
        if(root.val>R){
            return rangeSumBST(root.left,L,R);
        }else if(root.val<L){
            return rangeSumBST(root.right,L,R);
        }else{
            return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
        }
    }
}
