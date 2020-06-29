package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午2:52 2020/6/29
 * @Modify:
 * @Description: leetCode 1021
 * @题目:
 *      有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。
 *      例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 *      如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 *      给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 *      对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S
 *   PS:S.length <= 10000
 *      S[i] 为 "(" 或 ")"
 *      S 是一个有效括号字符串
 * @Case:
 *      输入："(()())(())"
 *      输出："()()()"
 *      解释：
 *      输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 *      删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"
 * @思路:
 *
 */
public class LeetCode_1021 {
    public String removeOuterParentheses(String S){
        char[] str=new char[S.length()];
        int k=0;
        int level = 0;
        for (char c:S.toCharArray()) {
            if (c == ')') {
                --level;
            }
            if (level >= 1) {
                str[k]=c;
                k++;
            }
            if (c == '(') {
                ++level;
            }
        }
        return String.valueOf(str,0,k);
    }

    public static void main(String[] args){
        String s="(()())(())";
        System.out.println(new LeetCode_1021().removeOuterParentheses(s));
    }
}
