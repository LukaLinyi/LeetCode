package com.linyi.leetcode.leetcode_1001_1500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午2:27 2020/6/29
 * @Modify:
 * @Description: leetcode 1299
 * @题目:
 *      给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *      完成所有替换操作后，请你返回这个数组
 *   PS:1 <= arr.length <= 10^4
 *      1 <= arr[i] <= 10^5
 * @Case:
 *      输入：arr = [17,18,5,4,6,1]
 *      输出：[18,6,6,6,1,-1]
 * @思路:空间换时间，一遍扫描即可;或者直接在arr数组上操作
 *
 */
public class LeetCode_1299 {
    public int[] replaceElements(int[] arr){
        int max=arr[arr.length-1];
        int tmp=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                tmp=max;
                max=arr[i];
                arr[i]=tmp;
            }else{
                arr[i]=max;
            }
            if(arr.length-1==i){
                arr[i]=-1;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={17,18,5,4,6,1};
        System.out.println(Arrays.toString(new LeetCode_1299().replaceElements(arr)));
    }
}
