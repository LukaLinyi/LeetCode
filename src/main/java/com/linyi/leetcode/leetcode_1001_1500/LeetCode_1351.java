package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午4:43 2020/6/29
 * @Modify:
 * @Description: leetcode 1351
 * @思路：暴力法；行有序，利用二分查找法；行列都有序，分治方法；利用第i行首个负数的位置Pos(i)，在第i+1行时，在[0,Pos(i)]的范围内查找
 */
public class LeetCode_1351 {
    public int countNegatives(int[][] grid){
        int rowNum=grid.length;
        int columnNum=grid[0].length;
        int columnPos=columnNum-1;
        int minusCounts=0;
        int j=0;
        for(int i=0;i<rowNum;i++){
            for(j=columnPos;j>=0;j--){
                if(grid[i][j]>=0){
                    if(j+1<columnNum){
                        columnPos=j+1;
                        minusCounts+=(columnNum-columnPos);
                    }
                    break;
                }
            }
            if(-1==j){
                columnPos=j;
                minusCounts+=columnNum;
            }
        }
        return minusCounts;
    }
    public static void main(String[] args){
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(new LeetCode_1351().countNegatives(grid));
    }
}
