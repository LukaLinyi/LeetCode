package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhenglinyi
 * @Time: 下午11:36 2019/3/23
 * @Modify:
 * @Description:
 */
public class LeetCode_4 {

    /**
     * @Description:
     *      问题描述：给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
     *              请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     *
     *      算法思想：1，中位数即使在有序数字序列中间位置的数据
     *              2，本算法的时间复杂为O(m+n)
     *              3，主要操作从两个数组的两头往中间搜索，记录搜索次数等于(m+n)/2即为停止。
     *
     *      实验数据：
     *          输入 nums1 = [1, 3]，nums2 = [2]，输出 中位数是 2.0 ；
     *          输入 nums1 = [1, 2]，nums2 = [3, 4]，输出 中位数是 (2 + 3)/2 = 2.5
     * @Method: findMedianSortedArrays
     * @Params: [nums1, nums2]
     * @Return: double
     * @Author: zhenglinyi
     * @Create: 下午11:45 2019/3/23
     * @Modify:
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numsLength1=nums1.length;
        int numsLength2=nums2.length;
        int medianBegin=0;
        int medianEnd=0;
        int findCount=1;
        int i=0,j=0;
        int firstNumIndex=(numsLength1+numsLength2)%2==0?(numsLength1+numsLength2)/2:(numsLength1+numsLength2)/2+1;
        int secondNumIndex=(numsLength1+numsLength2)%2==0?(numsLength1+numsLength2)/2+1:(numsLength1+numsLength2)/2+1;
        if(numsLength1==1 && numsLength2==1){
            return (double) (nums1[numsLength1-1] + nums2[numsLength2-1]) / 2.0;
        }
        while(i<numsLength1 && j<numsLength2){
            if(nums1[i]<=nums2[j]){
                if(firstNumIndex==findCount){
                    medianBegin=nums1[i];
                }
                if(secondNumIndex==findCount){
                    medianEnd=nums1[i];
                }
                i++;
            }else{
                if(firstNumIndex==findCount){
                    medianBegin=nums2[j];
                }
                if(secondNumIndex==findCount){
                    medianEnd=nums2[j];
                }
                j++;
            }
            findCount++;
            if(findCount>secondNumIndex){
                break;
            }
        }
        while(i<numsLength1){
            if(firstNumIndex==findCount){
                medianBegin=nums1[i];
            }
            if(secondNumIndex==findCount){
                medianEnd=nums1[i];
            }
            i++;
            findCount++;
            if(findCount>secondNumIndex){
                break;
            }
        }
        while(j<numsLength2){
            if(firstNumIndex==findCount){
                medianBegin=nums2[j];
            }
            if(secondNumIndex==findCount){
                medianEnd=nums2[j];
            }
            j++;
            findCount++;
            if(findCount>secondNumIndex){
                break;
            }
        }
        return ((double) medianBegin + (double) medianEnd) / 2.0;
    }

    public static void main(String[] args){
        int[] a={1,2};
        int[] b={3,4};

        System.out.println(new LeetCode_4().findMedianSortedArrays(a,b));
    }
}
