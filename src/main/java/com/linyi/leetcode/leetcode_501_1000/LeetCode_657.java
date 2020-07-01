package com.linyi.leetcode.leetcode_501_1000;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午5:30 2020/7/1
 * @Modify:
 * @Description: leetcode 657
 */
public class LeetCode_657 {
    public boolean judgeCircle(String moves){
        int ud_result = 0;
        int lf_result = 0;
        for (char c : moves.toCharArray()) {
            if(c=='U'){
                ud_result++;
            }else if(c=='D'){
                ud_result--;
            }else if(c=='L'){
                lf_result++;
            }else{
                lf_result--;
            }
        }
        return ud_result == 0 && lf_result == 0 ? true : false;
    }
}
