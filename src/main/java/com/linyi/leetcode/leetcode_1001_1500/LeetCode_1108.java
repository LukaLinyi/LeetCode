package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午9:40 2020/6/28
 * @Modify:
 * @Description: leetcode 1108
 * @题目:
 *      给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *      所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."
 * @Case:
 *      输入：address = "1.1.1.1"
 *      输出："1[.]1[.]1[.]1"
 */
public class LeetCode_1108 {
    public String defangIPaddr(String address){
        return address.replace(".","[.]");
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_1108().defangIPaddr("1.1.1.1"));
    }
}
