package com.linyi.leetcode.leetcode_1_500;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhenglinyi
 * @Time: 下午3:07 2019/3/23
 * @Modify:
 * @Description:
 */
public class LeetCode_1 {
    public static void main(String[] args){
        int[] nums={2, 7, 11, 15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashTable=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int otherNum=target-nums[i];
            if(null!=hashTable.get(otherNum)){
                return new int[]{hashTable.get(otherNum),i};
            }else{
                hashTable.put(nums[i],i);
            }
        }
        return null;
    }
}
