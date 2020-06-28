package com.linyi.leetcode.leetcode_1001_1500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午10:59 2020/6/28
 * @Modify:
 * @Description: leetcode 1365
 * @题目:
 *      给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 *      换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 *      以数组形式返回答案。
 *      2 <= nums.length <= 500
 *      0 <= nums[i] <= 100
 * @Case:
 *      输入：nums = [8,1,2,2,3]
 *      输出：[4,0,1,1,3]
 *      解释：
 *      对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
 *      对于 nums[1]=1 不存在比它小的数字。
 *      对于 nums[2]=2 存在一个比它小的数字：（1）。
 *      对于 nums[3]=2 存在一个比它小的数字：（1）。
 *      对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）
 * @思路：
 *      1，利用暴力枚举，时间复杂度O(n^2)
 *      2，快速排序，时间复杂度O(nlgn)
 *      3，利用0<=nums[i]<=100，以nums[i]为新数组的下标，数字出现的次数之和即小于该元素的个数
 */
public class LeetCode_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums){
        int maxNum=nums[0];
        for(int i=0;i<nums.length;i++){
            maxNum=maxNum>nums[i]?maxNum:nums[i];
        }
        int[] newNums=new int[maxNum+1];
        for(int i=0;i<nums.length;i++){
            newNums[nums[i]]++;
        }
        for(int i=1;i<=maxNum;i++){
            newNums[i]+=newNums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=0;
            }else {
                nums[i] = newNums[nums[i] - 1];
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(new LeetCode_1365().smallerNumbersThanCurrent(nums)));
    }
}
