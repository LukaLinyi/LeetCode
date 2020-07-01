package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午6:08 2020/7/1
 * @Modify:
 * @Description: leetcode 1309
 */
public class LeetCode_1309 {
    public String freqAlphabets(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                sb.append((char)((s.charAt(i)-'1')*10+(s.charAt(i+1)-'0')+'j'));
                i+=3;
            }else{
                sb.append((char)(s.charAt(i)-'1'+'a'));
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_1309().freqAlphabets("10#11#12"));
    }
}
