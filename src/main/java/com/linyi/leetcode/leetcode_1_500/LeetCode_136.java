package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午9:40 2020/6/24
 * @Modify:
 * @Description:leetcode 136
 * @题目：
 *      只出现一次的数字
 *      给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *      说明：
 *      你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * @case：
 *      输入: [2,2,1],输出: 1
 *      输入: [4,1,2,1,2],输出: 4
 * @思路：利用自己和自己异或为零的原则
 */
public class LeetCode_136 {
    public int singleNumber(int[] nums) {
        int singleNumber=nums[0];
        for(int i=1;i<nums.length;i++){
            singleNumber=singleNumber^nums[i];
        }
        return singleNumber;
    }

    public int singleNumberV2(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[0]=nums[0]^nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args){
        int[] nums={2,2,1};
        System.out.println(new LeetCode_136().singleNumber(nums));
        System.out.println(new LeetCode_136().singleNumberV2(nums));
    }
}
