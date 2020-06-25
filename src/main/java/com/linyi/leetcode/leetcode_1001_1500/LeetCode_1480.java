package com.linyi.leetcode.leetcode_1001_1500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午7:29 2020/6/24
 * @Modify:
 * @Description:leetcode 1480
 * @题目：
 *      给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。请返回 nums 的动态和。
 * @case：
 *      输入：nums = [1,2,3,4]
 *      输出：[1,3,6,10]
 *      解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4]
 */
public class LeetCode_1480 {
    public int[] runningSum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(new LeetCode_1480().runningSum(nums)));
    }
}
