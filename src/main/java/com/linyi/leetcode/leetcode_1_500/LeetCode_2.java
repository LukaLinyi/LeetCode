package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhenglinyi
 * @Time: 下午3:22 2019/3/23
 * @Modify:
 * @Description:
 */
public class LeetCode_2 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * @Description:
     *      问题描述：给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字
     *              如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。您可以假设除了数字 0 之外，这两个数都不会以 0 开头
     *
     *      算法核心思想：即两个链表同时往下搜索，两个节点的值相加之和sum不超过10，则结果直接作为当前节点的值；
     *                  若sum超过10就取sum%10的结果作为当前节点的值，同时新建一个节点作为下一个节点，并把sum／10的结果作为下一个节点值。
     *                 需要注意的是两个链表长度不一样的问题，同时注意相加之和的进位问题。
     *
     *      实验数据：输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)，两个链表分别是342 和 465 的 逆序
     *              输出：7 -> 0 -> 8
     *              原因：342 + 465 = 807
     * @Method: addTwoNumbers
     * @Params: [l1, l2]
     * @Return: LeetCode_2.ListNode
     * @Author: zhenglinyi
     * @Create: 下午10:39 2019/3/23
     * @Modify:
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList=new ListNode(0);
        ListNode sumListPoint=sumList;
        ListNode l1Point=l1;
        ListNode l2Point=l2;
        int incr=0;
        int sum=0;
        while(null!=l1Point || null!=l2Point){
            sum=(null!=l1Point?l1Point.val:0)+(null!=l2Point?l2Point.val:0);
            if(sumList==sumListPoint){
                sumListPoint.val=sum%10;
                incr=sum/10;
            }else{
                sum=sum+sumListPoint.val;
                incr=sum/10;
                sumListPoint.val=sum%10;
            }
            if(incr>0 || (null!=l1Point && null!=l1Point.next) || (null!=l2Point && null!=l2Point.next)) {
                ListNode tmp = new ListNode(incr > 0 ? incr : 0);
                sumListPoint.next=tmp;
                sumListPoint=tmp;
            }
            l1Point=(null!=l1Point?l1Point.next:null);
            l2Point=(null!=l2Point?l2Point.next:null);
        }
        return sumList;
    }

    public static void main(String[] args){

    }
}
