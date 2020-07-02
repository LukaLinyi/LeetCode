package com.linyi.common;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午9:42 2020/7/2
 * @Modify:
 * @Description:
 */
public class QuickSort {

    /**
     * @Description:快速排序非递归的实现方式 PS:必须先从右往左
     * @Method: QuickSortWithoutRecursive
     * @Params: [nums]
     * @Return: int[]
     * @Author: zhenglinyi
     * @Create: 下午9:44 2020/7/2
     * @Modify:
     */
    public int[] QuickSortWithoutRecursive(int[] nums){
        int leftPos=0;
        int rightPos=nums.length-1;
        Stack<Integer> stack=new Stack<>();
        stack.push(leftPos);
        stack.push(rightPos);
        while(!stack.isEmpty()){
            rightPos=stack.pop();
            leftPos=stack.pop();
            int hign=rightPos;
            int low=leftPos;
            int mid=low+(hign-low)/2;
            int midValue=nums[mid];
            while(low<hign){
                while(low<hign && nums[hign]>=midValue){hign--;}
                while(low<hign && nums[low]<=midValue){low++;}
                if(low<hign){
                    if(nums[low]!=nums[hign]){
                        nums[low]=nums[low]+nums[hign];
                        nums[hign]=nums[low]-nums[hign];
                        nums[low]=nums[low]-nums[hign];
                    }
                }
            }
            nums[mid]=nums[low];
            nums[low]=midValue;
            if(low+1<rightPos){
                stack.push(low+1);
                stack.push(rightPos);
            }
            if(low-1>leftPos){
                stack.push(leftPos);
                stack.push(low-1);
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums={1,4,6,5,3,8,2};
        System.out.println(Arrays.toString(new QuickSort().QuickSortWithoutRecursive(nums)));
    }
}
