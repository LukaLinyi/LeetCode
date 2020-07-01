package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午2:24 2020/7/1
 * @Modify:
 * @Description: leetcode 1252
 * @思路:设置两个boolean数组，一个行数组row[]，一个列数组column[]；因为boolean数组默认值是false，而待转变数组的元素默认是偶数
 *      当第一次行变换时，row[行号]=true=!row[行号];该行第二变化时，row[行号]=false=!row[行号]；
 *      同理：当第一次列变换时，column[列号]=true=!column[列号];该行第二变化时，column[列号]=false=!column[列号]；
 *      当indices一遍扫描完成后，就形成了row[n],column[m]两个结果数组。
 *      而row[n],column[m]实际构成了如下二位矩阵
 *                0      1
 *              true   false
 *      0 true
 *      1 false
 *      若row[i] column[j] = [true,true],则这个 i,j 这个位置为偶数
 *      若row[i] column[j] = [true,false],则这个 i,j 这个位置为奇数
 *      若row[i] column[j] = [false,false],则这个 i,j 这个位置为偶数
 *      若row[i] column[j] = [false,true],则这个 i,j 这个位置为奇数
 */
public class LeetCode_1252 {
    public int oddCells(int n, int m, int[][] indices){
        boolean[] row=new boolean[n];
        boolean[] column=new boolean[m];
        int count=0;
        int trueCount=0;
        for(int i=0;i<indices.length;i++){
            row[indices[i][0]]=!row[indices[i][0]];
            column[indices[i][1]]=!column[indices[i][1]];
        }
        for(int i=0;i<m;i++){
            trueCount+=(column[i]?1:0);
        }
        for(int i=0;i<n;i++){
            count+=(row[i]?(m-trueCount):trueCount);
        }
        return count;
    }

    public static void main(String[] args){
        int n=2;
        int m=3;
        int[][] indices={{0,1},{1,1}};
        System.out.println(new LeetCode_1252().oddCells(n,m,indices));
    }
}
