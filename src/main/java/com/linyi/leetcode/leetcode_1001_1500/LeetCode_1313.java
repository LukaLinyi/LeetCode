package com.linyi.leetcode.leetcode_1001_1500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午10:00 2020/6/28
 * @Modify:
 * @Description: leetcode 1313
 * @题目：
 *      给你一个以行程长度编码压缩的整数列表 nums 。
 *      考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 *      请你返回解压后的列表
 *      2 <= nums.length <= 100
 *      nums.length % 2 == 0
 *      1 <= nums[i] <= 100
 * @Case：
 *      输入：nums = [1,2,3,4]
 *      输出：[2,4,4,4]
 *      解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
 *      第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
 *      最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]
 * @思路：主要考虑下存储问题和时间效率，nums[i]<=100，nums.length<=100，所以新数组最长位 （nums.length/2*100）
 *       时间复杂度O(sum(nums[2*i]))
 */
public class LeetCode_1313 {
    public int[] decompressRLElist(int[] nums){
        int newNumsLength=0;
        int newNumsPos=0;
        for(int i=0;i<nums.length/2;i++){
            newNumsLength+=nums[2*i];
        }
        int[] newNums=new int[newNumsLength];
        for(int i=0;i<nums.length/2;i++){
            for(int j=newNumsPos;j<(newNumsPos+nums[2*i]);j++){
                newNums[j]=nums[2*i+1];
            }
            newNumsPos+=nums[2*i];
        }
        return newNums;
    }
    public static void main(String[] args){
        int[] nums={1,1,2,3};
        System.out.println(Arrays.toString(new LeetCode_1313().decompressRLElist(nums)));
    }
}
