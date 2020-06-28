package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午9:11 2020/6/28
 * @Modify:
 * @Description: leetcode 1342
 * @题目：
 *      给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1
 * @Case：
 *      输入：num = 14
 *      输出：6
 *      解释：
 *      步骤 1) 14 是偶数，除以 2 得到 7 。
 *      步骤 2） 7 是奇数，减 1 得到 6 。
 *      步骤 3） 6 是偶数，除以 2 得到 3 。
 *      步骤 4） 3 是奇数，减 1 得到 2 。
 *      步骤 5） 2 是偶数，除以 2 得到 1 。
 *      步骤 6） 1 是奇数，减 1 得到 0
 */
public class LeetCode_1342 {
    public int numberOfSteps (int num){
        int times=0;
        while(num>0){
            if(num%2==1){
                times++;
                num-=1;
            }else{
                times++;
                num/=2;
            }
        }
        return times;
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_1342().numberOfSteps(8));
    }
}
