package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhenglinyi
 * @Time: 下午4:35 2019/3/23
 * @Modify:
 * @Description:
 */
public class LeetCode3 {

    /**
     * @Description:
     *     问题描述：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     *     核心思路：
     *          int [26] 用于字母 ‘a’ - ‘z’或 ‘A’ - ‘Z’
     *          int [128] 用于ASCII码
     *          int [256] 用于扩展ASCII码
     *     算法思想：1，比较当前位置上的字符在index索引数组中的值，字符的ASCII码即为下标，取索引里的值和起始位置取最大值 作为 新的起始位置，
     *                结果为0表示是一个不重复的新字符，否则是一个出现过的字符
     *             2，当前不重复子串的长度subStrlen 和 当前位置减去起始位置加1 进行比较取最大值，如果是取subStrlen，则说明字符出现重复了；
     *                否则说明不重复子串长度在增加
     *             3，将此时当前位置上字符的ASCII值作为index数组下表的位置，值为当前位置+1，表示在字符串s中的位置
     *             4，最后输出步骤2中的最长子串的长度即可。
     *
     *     算法2：借助set集合中元素的非重复性进行处理，当遇到重复字符时，需要清空set集合
     *
     *     实验数据：输入"abcabcbb" 输出 3 ；输入 "bbbbb"，输入 1 ；输入 "pwwkew" 输出 3
     * @Method: lengthOfLongestSubstring
     * @Params: [s]
     * @Return: int
     * @Author: zhenglinyi
     * @Create: 下午10:26 2019/3/23
     * @Modify:
     */
    public int lengthOfLongestSubstring(String s){
        int[] index=new int[128];
        int strlen=s.length();
        int subStrlen=0;
        for(int currentIndex=0,startIndex=0;currentIndex<strlen;currentIndex++){
            startIndex=Math.max(index[s.charAt(currentIndex)],startIndex);
            subStrlen=Math.max(subStrlen,currentIndex-startIndex+1);
            index[s.charAt(currentIndex)]=currentIndex+1;
        }
        return subStrlen;
    }
}
