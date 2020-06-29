package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午11:12 2020/6/29
 * @Modify:
 * @Description: leetcode 1464
 * @题目:
 *      给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
 *      请你计算并返回该式的最大值
 *   ps:2 <= nums.length <= 500
 *      1 <= nums[i] <= 10^3
 * @Case:
 *       输入：nums = [3,4,5,2]
 *       输出：12
 *       解释：如果选择下标 i=1 和 j=2（下标从 0 开始），则可以获得最大值，(nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12
 * @思路:
 *      动态规划和双指针扫描，两个指针对应的元素，谁小移动谁
 */
public class LeetCode_1464 {
    public int maxProduct(int[] nums){
        int maxPlus=0;
        for(int i=0,j=nums.length-1;i<j;){
            if(maxPlus<(nums[i]-1)*(nums[j]-1)){
                maxPlus=(nums[i]-1)*(nums[j]-1);
            }
            if(nums[i]>=nums[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxPlus;
    }
    public static void main(String[] args){
        int[] nums={1,5,4,5};
        System.out.println(new LeetCode_1464().maxProduct(nums));
    }
}
