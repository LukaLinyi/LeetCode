package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午5:55 2020/6/29
 * @Modify:
 * @Description: leetCode 461
 * @题目:
 *      两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *      给出两个整数 x 和 y，计算它们之间的汉明距离。
 *      注意：0 ≤ x, y < 2^31.
 * @思路：异或，与1，然后左移，知道异或的结果为0
 */
public class LeetCode_461 {
    public int hammingDistance(int x, int y){
        x=x^y;
        y=0;
        while(x>0){
            y+=(x&1);
            x=x>>1;
        }
        return y;
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_461().hammingDistance(4,1));
    }
}
