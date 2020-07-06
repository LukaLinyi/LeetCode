package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:47 2020/7/6
 * @Modify:
 * @Description:leetcode 1491
 */
public class LeetCode_1491 {
    public double average(int[] salary){
        int sum=0;
        int max=salary[0];
        int min=salary[0];
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
            if(max<salary[i]){
                max=salary[i];
            }
            if(min>salary[i]){
                min=salary[i];
            }
        }
        return (sum-max-min)*1.0/(salary.length-2);
    }
}
