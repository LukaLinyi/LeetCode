package com.linyi.leetcode.leetcode_501_1000;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:52 2020/7/6
 * @Modify:
 * @Description:leetcode 561
 * @思路:
 *      在每一组min(ai,bi)中，ai和bi必须是递增序列中相邻的两个值，如果ai，bi是相差很大的数对，则提前消耗掉大值，造成总和不是最大值。
 *      所以只需对数组排序，取(i，i+1)的数对即可
 */
public class LeetCode_561 {
    public int arrayPairSum(int[] nums){
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
}
