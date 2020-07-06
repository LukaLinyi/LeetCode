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
     * @Description:快速排序增序非递归的实现方式(测试中) PS:必须先从右往左
     * @Method: QuickSortIncrWithoutRecursive
     * @Params: [nums]
     * @Return: int[]
     * @Author: zhenglinyi
     * @Create: 下午9:44 2020/7/2
     * @Modify:
     */
    public int[] QuickSortIncrWithoutRecursive(int[] nums){
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
            int flagValue=nums[mid];
            int tmp=0;
            while(low<hign){
                while(low<hign && nums[hign]>=flagValue){hign--;}
                while(low<hign && nums[low]<=flagValue){low++;}
                if(low<hign){
                    tmp=nums[0];
                    nums[mid]=nums[low];
                    nums[low]=tmp;
                }
            }
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

    /**
     * @Description:快速排序非递归的实现方式(增序) PS:必须先从右往左
     * @Method: QuickSortIncrWithoutRecursiveV2
     * @Params: [nums]
     * @Return: int[]
     * @Author: zhenglinyi
     * @Create: 下午9:44 2020/7/2
     * @Modify:
     */
    public int[] QuickSortIncrWithoutRecursiveV2(int[] nums){
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
            int flagValue=nums[low+(hign-low)/2];
            while(low<hign){
                while(low<hign && nums[hign]>=flagValue){hign--;}

                while(low<hign && nums[low]<=flagValue){low++;}
            }
            nums[low] = flagValue;
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

    /**
     * @Description:快速排序非递归的实现方式(降序) (测试中)
     * @Method: QuickSortDescWithoutRecursive
     * @Params: [nums]
     * @Return: int[]
     * @Author: zhenglinyi
     * @Create: 上午9:01 2020/7/3
     * @Modify:
     */
    public int[] QuickSortDescWithoutRecursive(int[] nums){
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
            int flagValue=nums[mid];
            while(low<hign){
                while(low<hign && nums[hign]<=flagValue){hign--;}
                while(low<hign && nums[low]>=flagValue){low++;}
                if(low<hign){
                    if(nums[low]!=nums[hign]){
                        nums[low]=nums[low]+nums[hign];
                        nums[hign]=nums[low]-nums[hign];
                        nums[low]=nums[low]-nums[hign];
                    }
                }
            }
            nums[mid]=nums[hign];
            nums[hign]=flagValue;
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
        int[] nums={1,1,3,2,1,4};
        System.out.println("test case 1:"+Arrays.toString(new QuickSort().QuickSortIncrWithoutRecursive(nums)));

//        int[] numss={3,2,1,3};
////        System.out.println(Arrays.toString(new QuickSort().QuickSortDescWithoutRecursive(numss)));
//        System.out.println("test case 2:"+Arrays.toString(new QuickSort().QuickSortIncrWithoutRecursiveV2(numss)));
    }
}
