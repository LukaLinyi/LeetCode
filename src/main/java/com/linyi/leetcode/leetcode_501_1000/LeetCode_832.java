package com.linyi.leetcode.leetcode_501_1000;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午4:27 2020/7/1
 * @Modify:
 * @Description: leetcode 832
 */
public class LeetCode_832 {
    public int[][] flipAndInvertImage(int[][] A){
        for(int i=0;i<A.length;i++){
            int oldPosValue=0;
            for(int j=0,k=A[i].length-1;j<=k;j++,k--){
                oldPosValue=1-A[i][j];
                A[i][j]=1-A[i][k];
                A[i][k]=oldPosValue;
            }
        }
        return A;
    }
    public static void main(String[] args){
        int[][] A={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(new LeetCode_832().flipAndInvertImage(A)[1]));
    }
}
