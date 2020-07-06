package com.linyi.leetcode.leetcode_501_1000;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午5:05 2020/7/6
 * @Modify:
 * @Description: leetcode 997
 * @思路:
 *      数组处理成非负数，且递增的顺序数组，然后每个元素平方填充原位置O(nlogn)
 *      因为原数组有序，可以使用双指针从正负数的分界线开始往两边进行扫描 O(n)
 */
public class LeetCode_997 {
    public int[] sortedSquares(int[] A){
        int size=A.length;
        int[] nums=new int[size];
        int i=0,j=0;
        int k=0;
        while(j<size && A[j]<0){
            j++;
        }
        i=j-1;
        while(i>=0 && j<size){
            if(A[i]*A[i]<A[j]*A[j]){
                nums[k++]=A[i]*A[i];
                i--;
            }else{
                nums[k++]=A[j]*A[j];
                j++;
            }
        }
        while(i>=0){
            nums[k++]=A[i]*A[i];
            i--;
        }
        while(j<size){
            nums[k++]=A[j]*A[j];
            j++;
        }
        return  nums;
    }

    public static void main(String[] args){
        int[] A={-4,-1,0,3,10};
        System.out.println(new LeetCode_997().sortedSquares(A));
    }
}
