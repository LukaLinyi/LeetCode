package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午8:39 2020/7/1
 * @Modify:
 * @Description: leetcode 1304
 */
public class LeetCode_1304 {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                nums[i]=0-sum;
            }else {
                nums[i] = i;
                sum += i;
            }
        }
        return nums;
    }
}
