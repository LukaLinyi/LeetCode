package com.linyi.leetcode.leetcode_1001_1500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午4:16 2020/7/6
 * @Modify:
 * @Description:leetcode 1385
 * @思路：
 *      |arr1[i]-arr2[j]|<=2 => arr1[i]-arr2[j]<=2 或者 arr1[i]-arr2[j]>=-2
 *    => arr1[i]+d >= arr2[j] >= arr1[d]-d
 *
 *    第一种：直接顺序搜索即可，时间复杂度O(m*n)
 *    第二种：排序后使用二分查找，时间复杂度O((m+n)logm)
 */
public class LeetCode_1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d){
        int minRange=0;
        int maxRange=0;
        int count=arr1.length;
        int binarySearchPos=0;
        int left=0;
        int right=0;
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            left=0;
            right=arr2.length-1;
            minRange=arr1[i]-d;
            maxRange=arr1[i]+d;
            while(left<=right){
                binarySearchPos=left+(right-left)/2;
                if(arr2[binarySearchPos]>maxRange){
                    left=left;
                    right=binarySearchPos-1;
                }else if(arr2[binarySearchPos]<minRange){
                    left=binarySearchPos+1;
                    right=right;
                }else{
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr1={4,-3,-7,0,-10};
        int[] arr2={10};
        int d=69;
        System.out.println(new LeetCode_1385().findTheDistanceValue(arr1,arr2,d));
    }
}
