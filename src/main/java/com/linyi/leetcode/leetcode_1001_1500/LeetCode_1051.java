package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午4:32 2020/7/2
 * @Modify:
 * @Description: leetcode 1051
 * @思路：
 *      解法一：比较排完序前和排完序后，同一位置上前后不一致的数量，因为排序的最优时间复杂度是O(nlogn)
 *      解法二：利用排序完是递增序列，以元素映射成哈希数组的下标，必定是元素小的在前，大的在后。只要顺序扫描只要比较原位置和新位置不想等的次数。
 */
public class LeetCode_1051 {
    public int heightChecker(int[] heights){
        int[] arr = new int[101];
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                if (heights[j++] != i) {count++;}
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] heights={1,4,6,5,3,8,2};
        System.out.println(new LeetCode_1051().heightChecker(heights));
    }
}
