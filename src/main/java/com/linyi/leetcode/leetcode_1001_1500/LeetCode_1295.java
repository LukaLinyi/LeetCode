package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午9:48 2020/6/28
 * @Modify:
 * @Description: leetCode 1295
 * @题目：
 *      给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。1 <= nums.length <= 500，1 <= nums[i] <= 10^5。
 * @Case：
 *      输入：nums = [12,345,2,6,7896]
 *      输出：2
 *      解释：
 *      12 是 2 位数字（位数为偶数） 
 *      345 是 3 位数字（位数为奇数）  
 *      2 是 1 位数字（位数为奇数） 
 *      6 是 1 位数字 位数为奇数） 
 *      7896 是 4 位数字（位数为偶数）  
 *      因此只有 12 和 7896 是位数为偶数的数字
 * @思路：
 *      给出了数据范围，之间判断数据范围即可，2位即>=10 <=99
 */
public class LeetCode_1295 {
    public int findNumbers(int[] nums) {
        int numCount=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]>=100000 && nums[i]<1000000) || (nums[i]>=1000 && nums[i]<10000) || (nums[i]>=10 && nums[i]<100)){
                numCount++;
            }
        }
        return numCount;
    }
    public static void main(String[] args){
        int[] nums={12,345,2,6,7896};
        System.out.println(new LeetCode_1295().findNumbers(nums));
    }
}
