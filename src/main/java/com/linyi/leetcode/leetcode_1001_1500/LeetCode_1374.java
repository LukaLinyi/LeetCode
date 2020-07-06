package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午12:05 2020/7/6
 * @Modify:
 * @Description:leetcode 1374
 */
public class LeetCode_1374 {
    public String generateTheString(int n) {
        StringBuilder sb=new StringBuilder();
        if(n==1){
            return "a";
        }
        if(n%2==0) {
            for (int i = 0; i < 1; i++) {
                sb.append('a');
            }
            for (int i = 1; i < n; i++) {
                sb.append('b');
            }
        }else{
            for (int i = 0; i < 1; i++) {
                sb.append('a');
            }
            for (int i = 1; i < 2; i++) {
                sb.append('b');
            }
            for (int i=2;i<n;i++){
                sb.append('c');
            }
        }
        return sb.toString();
    }
}
