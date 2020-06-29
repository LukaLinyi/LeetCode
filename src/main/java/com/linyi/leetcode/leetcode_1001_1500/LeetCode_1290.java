package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午10:59 2020/6/29
 * @Modify:
 * @Description: leetcode 1290
 * @题目：
 *      给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 *      请你返回该链表所表示数字的 十进制值
 *   ps：链表不为空。
 *       链表的结点总数不超过 30。
 *       每个结点的值不是 0 就是 1
 * @Case：输入：head = [1,0,1]
 *        输出：5
 *        解释：二进制数 (101) 转化为十进制数 (5)
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LeetCode_1290 {
    public int getDecimalValue(ListNode head){
        int decimalValue=0;
        while(null!=head){
            decimalValue=(decimalValue*2+head.val);
            head=head.next;
        }
        return decimalValue;
    }
}
