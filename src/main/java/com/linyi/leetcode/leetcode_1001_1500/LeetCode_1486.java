package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午7:42 2020/6/24
 * @Modify:
 * @Description:leetcode 1486
 * @题目：
 *      给你两个整数，n 和 start 。
 *      数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 *      请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 * @Case：
 *      输入：n = 5, start = 0
 *      输出：8
 *      解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。"^" 为按位异或 XOR 运算符。
 * @思路：
 */
public class LeetCode_1486 {
    public int xorOperation(int n, int start){
        int value=0;
        for(int i=0;i<n;i++){
            value^=(start+2*i);
        }
        return value;
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_1486().xorOperation(5,0));
    }
}
