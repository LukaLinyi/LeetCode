package com.linyi.leetcode.leetcode_501_1000;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午11:44 2020/6/25
 * @Modify:
 * @Description:leetcode 771
 * @题目：
 *      给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *      J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * @Case：
 *      输入: J = "aA", S = "aAAbbbb"
 *      输出: 3
 *
 *      输入: J = "z", S = "ZZ"
 *      输出: 0
 * @思路：哈希数组解决，将字符的ASCTII映射成数组的下标即可。
 *       注意大小写字母一共是52个，注意压缩存储空间
 */
public class LeetCode_771 {
    public int numJewelsInStones(String J, String S) {
        int[] hashTable=new int[52];
        int upperA='A';
        int diffAa='a'-26;
        int sum=0;
        for(int i=0;i<52;i++){
            hashTable[i]=0;
        }
        for(int i=0;i<J.length();i++){
            if(J.charAt(i)>='a'){
                hashTable[J.charAt(i)-diffAa]=1;
            }else{
                hashTable[J.charAt(i)-upperA]=1;
            }
        }
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)>='a'){
                sum+=hashTable[S.charAt(i)-diffAa];
            }else{
                sum+=hashTable[S.charAt(i)-upperA];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        String J="aA";
        String S="aAAbbbb";
        System.out.println(new LeetCode_771().numJewelsInStones(J,S));
    }
}
