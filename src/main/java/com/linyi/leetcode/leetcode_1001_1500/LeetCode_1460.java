package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:12 2020/6/29
 * @Modify:
 * @Description: leetcode 1460
 * @题目：
 *      给你两个长度相同的整数数组 target 和 arr 。
 *      每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。
 *      如果你能让 arr 变得与 target 相同，返回 True；否则，返回 False
 *   PS:target.length == arr.length
 *      1 <= target.length <= 1000
 *      1 <= target[i] <= 1000
 *      1 <= arr[i] <= 1000
 * @Case：
 *      输入：target = [1,2,3,4], arr = [2,4,1,3]
 *      输出：true
 *      解释：你可以按照如下步骤使 arr 变成 target：
 *      1- 翻转子数组 [2,4,1] ，arr 变成 [1,4,2,3]
 *      2- 翻转子数组 [4,2] ，arr 变成 [1,2,4,3]
 *      3- 翻转子数组 [4,3] ，arr 变成 [1,2,3,4]
 *      上述方法并不是唯一的，还存在多种将 arr 变成 target 的方法
 * @思路：怎么翻不重要，只要arr数组里的元素和target数组的元素一致就可以;
 *       用byte数组来表示hash表;
 *       此处需要考虑元素重复的情况如何处理。
 */
public class LeetCode_1460 {
    public boolean canBeEqual(int[] target, int[] arr){
        byte[] bitMap=new byte[1001];
        boolean result=true;
        for(int i=0;i<target.length;i++){
            bitMap[target[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            bitMap[arr[i]]--;
        }
        for(int i=0;i<bitMap.length;i++){
            if(bitMap[i]<0 || bitMap[i]>0){
                result=false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] target={1,2,3,4};
        int[] arr={2,4,1,3};
        System.out.println(new LeetCode_1460().canBeEqual(target,arr));

        byte test=127;
        System.out.println(test>>7);
    }
}
