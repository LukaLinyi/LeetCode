package com.linyi.leetcode.leetcode_1001_1500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午12:01 2020/6/28
 * @Modify:
 * @Description: leetcode 1389
 * @题目:
 *      给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 *      目标数组 target 最初为空。
 *      按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 *      重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 *      请你返回目标数组。
 *      题目保证数字插入位置总是存在
 *      1 <= nums.length, index.length <= 100
 *      nums.length == index.length
 *      0 <= nums[i] <= 100
 *      0 <= index[i] <= i
 *
 * @Case:
 *      输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
 *      输出：[0,4,1,3,2]
 *      解释：
 *      nums       index     target
 *      0            0        [0]
 *      1            1        [0,1]
 *      2            2        [0,1,2]
 *      3            2        [0,1,3,2]
 *      4            1        [0,4,1,3,2]
 *
 * @思路：如果当前位置已经插入了值，当前位置的元素以及当前位置之后的元素往后顺移一个下标。
 */
public class LeetCode_1389 {
    public int[] createTargetArray(int[] nums, int[] index){
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(index[j]>=index[i]){
                    index[j]++; //因为index[j]如果大于等于的index[j+k]，会导致target[index[j]]要后移，即index[j]要增加
                }
            }
        }
        //System.out.println(Arrays.toString(index));
        //还有一种方法，可以在nums直接移动元素，移动到本来的位置也算一次，则总的移动次数为nums.length，可以节省一个length长度的数组空间。
        for(int i=0;i<nums.length;i++){
            target[index[i]]=nums[i];
        }
        return target;
    }

    public static void main(String[] args){
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(new LeetCode_1389().createTargetArray(nums,index)));
    }
}
