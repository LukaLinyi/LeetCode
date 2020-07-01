package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:27 2020/7/1
 * @Modify:
 * @Description: leetcode 1323
 * @思路：找到数字中高位第一个非9的数字，转成9即可
 */
public class LeetCode_1323 {
    public int maximum69Number (int num){
        int newNum=0;
        int divisor=10000;
        while(num>0){
            if(num<divisor){
                divisor/=10;
            }else{
                if(num/divisor==6){
                    newNum+=9*divisor+num%divisor;
                    return newNum;
                }else{
                    newNum+=9*divisor;
                    num%=divisor;
                    divisor/=10;
                }
            }
        }
        return newNum;
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_1323().maximum69Number(9669));
    }
}
