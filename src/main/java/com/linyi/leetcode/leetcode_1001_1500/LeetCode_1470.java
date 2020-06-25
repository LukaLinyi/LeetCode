package com.linyi.leetcode.leetcode_1001_1500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午9:44 2020/6/24
 * @Modify:
 * @Description:leetcode 1470
 * @题目：
 *      给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *      请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 * @Case：
 *      输入：nums = [2,5,1,3,4,7], n = 3
 *      输出：[2,3,5,4,1,7]
 *      解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
 *
 *      输入：nums = [1,2,3,4,4,3,2,1], n = 4
 *      输出：[1,4,2,3,3,2,4,1]
 * @思路：首尾两端的元素不用换，中间[1,2n-2]的元素转到新的坐标上。
 *       在nums=[1,2,3,4,4,3,2,1]中，
 *       index=4的元素，新的index=1；index=5的元素，新的index=3；index=6的元素，新的index=5；
 *       也即占了新的坑位后，此坑位后的数据，顺序后移即可
 *       index=4的元素换位置，[1,2,3,4,4,3,2,1] =》 [1,4,2,3,4,3,2,1]
 *       index=5的元素换位置，[1,4,2,3,4,3,2,1] =》 [1,4,2,3,3,4,2,1]
 *       index=6的元素换位置，[1,4,2,3,3,4,2,1] =》 [1,4,2,3,3,2,4,1]
 * @思路2：空间换时间，效率更快
 */
public class LeetCode_1470 {
    public int[] shuffle(int[] nums, int n){
        int moveStart=n;//表示需要往前移动的元素(即y1，y2，y3 . . .yn-1)的下标，下标值[n,2n-2]
        int tmp=0;
        int moveStop=0;//每趟元素要移动的位置，即顺序交换时不能超过这个位置
        for(int times=1;times<n;times++){//times表示第几趟完整的顺序后移
            moveStop=(moveStart%n)*2+(moveStart/n);
            for(int index=moveStart;index>moveStop;index--){
                tmp=nums[index-1];
                nums[index-1]=nums[index];
                nums[index]=tmp;
            }
            moveStart++;
        }
        return nums;
    }

    public int [] shuffleV2(int[] nums, int n){//用空间换事件，效率更高
        int[] newNums=new int[n<<1];
        for(int i=0;i<n;i++){
            newNums[(i%n)*2+(i/n)]=nums[i];
            newNums[((i+n)%n)*2+((i+n)/n)]=nums[i+n];
        }
        return newNums;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,4,3,2,1};
        int n=4;
        System.out.println(Arrays.toString(new LeetCode_1470().shuffle(nums,n)));
        int[] newNums={1,2,3,4,4,3,2,1};
        int newN=4;
        System.out.println(Arrays.toString(new LeetCode_1470().shuffleV2(newNums,newN)));
    }
}
