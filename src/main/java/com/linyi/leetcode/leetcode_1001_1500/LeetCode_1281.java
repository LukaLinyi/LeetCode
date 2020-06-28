package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午9:25 2020/6/28
 * @Modify:
 * @Description: leetcode 1281
 * @题目：
 *      给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。1 <= n <= 10^5
 * @Case：
 *      输入：n = 234
 *      输出：15
 *      解释：
 *      各位数之积 = 2 * 3 * 4 = 24
 *      各位数之和 = 2 + 3 + 4 = 9
 *      结果 = 24 - 9 = 15
 */
public class LeetCode_1281 {
    public int subtractProductAndSum(int n){
        int plus=1;
        int sum=0;
        while(n>0){
            plus*=(n%10);
            sum+=(n%10);
            n/=10;
        }
        return plus-sum;
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_1281().subtractProductAndSum(4421));
    }
}
