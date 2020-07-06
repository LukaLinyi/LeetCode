package com.linyi.leetcode.leetcode_501_1000;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:20 2020/7/6
 * @Modify:
 * @Description: leetcode 942
 */
public class LeetCode_942 {
    public int[] diStringMatch(String S){
        int strlen=S.length();
        int[] nums=new int[strlen+1];
        int d=strlen;
        int i=0;
        int j=0;
        for(char c:S.toCharArray()){
            if(d>i){
                if(c=='D'){
                    nums[j++]=d--;
                }else{
                    nums[j++]=i++;
                }
            }
        }
        if(S.charAt(strlen-1)=='I'){
            nums[j]=nums[j-1]+1;
        }else{
            nums[j]=nums[j-1]-1;
        }
        return nums;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(new LeetCode_942().diStringMatch("DDI")));
    }
}
