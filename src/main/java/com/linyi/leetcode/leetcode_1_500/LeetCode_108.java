package com.linyi.leetcode.leetcode_1_500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午11:41 2020/7/6
 * @Modify:
 * @Description:leetcode 108
 */


public class LeetCode_108 {
    public TreeNode sortedArrayToBST(int[] nums){
        TreeNode root=null;
        int rootPos=0;
        if(0==nums.length){
            return root;
        }else {
            rootPos=nums.length / 2;
            root=new TreeNode(nums[rootPos]);
            root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,rootPos));
            root.right=sortedArrayToBST(Arrays.copyOfRange(nums,rootPos+1,nums.length));
        }
        return root;
    }

    public static void main(String[] args){
        int[] nums={-10,-3,0,5,9};
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,2)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums,3,nums.length)));
    }
}
