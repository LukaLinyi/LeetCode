package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午1:41 2020/6/29
 * @Modify:
 * @Description: leetcode 1221
 * @题目：
 *      在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *      给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *      返回可以通过分割得到的平衡字符串的最大数量
 *   PS:1 <= s.length <= 1000
 *      s[i] = 'L' 或 'R'
 *      分割得到的每个字符串都必须是平衡字符串
 * @Case:
 *      输入：s = "RLRRLLRLRL"
 *      输出：4
 *      解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R
 * @思路:不论是L开头还是R开头，遇到相同的，计数+1；不同的，计数-1；当计数为0时，即为一个平衡字符串
 */
public class LeetCode_1221 {
    public int balancedStringSplit(String s){
        int count=0;
        int subStrCount=0;
        for(int i=0;i<s.length();i++){
            if('R'==s.charAt(i)){
                count++;
            }else{
                count--;
            }
            if(0==count){
                subStrCount++;
            }
        }
        return subStrCount;
    }

    public static void main(String[] args){
        String s="RLRRLLRLRL";
        System.out.println(new LeetCode_1221().balancedStringSplit(s));
    }
}
