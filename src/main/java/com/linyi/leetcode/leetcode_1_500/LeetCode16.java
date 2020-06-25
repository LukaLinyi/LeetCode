package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午4:10 2020/6/24
 * @Modify:
 * @Description:leetcode 16
 * @题目：
 *      给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。
 *      返回这三个数的和。假定每组输入只存在唯一答案。
 * @Case：输入：nums = [-1,2,1,-4], target = 1
 *       输出：2
 *       解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *
 *       3 <= nums.length <= 10^3
 *       -10^3 <= nums[i] <= 10^3
 *       -10^4 <= target <= 10^4
 *
 * @思路：通过排序+枚举+双向指针。首先排序，然后枚举三个数字。先通过固定nums[i]，在剩下的[i+1,n)数组中，采用双向指针，枚举nums[j],nums[k]，
 *      使得nums[i]+nums[j]+nums[k]最接近target。
 *      其中，j是从左往右移动，k是从右往左移动，当nums[i]+nums[j]+nums[k]=target 或者 j=k-1时停止
 *
 */
public class LeetCode16 {
    public int threeSumClosest(int[] nums, int target){
        int closestSum=nums[0]+nums[1]+nums[2];
        int diffMin=Math.abs(target-closestSum);
        int tmp=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    tmp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=tmp;
                }
            }
        }
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1,k=nums.length-1;j<k;){
                if(target==(nums[i]+nums[j]+nums[k])){
                    return nums[i]+nums[j]+nums[k];
                }
                if(diffMin>Math.abs(target-(nums[i]+nums[j]+nums[k]))){
                    diffMin=Math.abs(target-(nums[i]+nums[j]+nums[k]));
                    closestSum=(nums[i]+nums[j]+nums[k]);
                }
                if((target-(nums[i]+nums[j]+nums[k]))>0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args){
        int[] nums={128,1,2,4,64,8,16,32};
        int target=82;
        //System.out.println(Arrays.toString(new LeetCode16().threeSumClosest(nums, target)));
        System.out.println(new LeetCode16().threeSumClosest(nums,target));
    }
}
