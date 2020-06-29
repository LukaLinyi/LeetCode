package com.linyi.leetcode.leetcode_1001_1500;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午7:27 2020/6/29
 * @Modify:
 * @Description: leetcode 1475
 * @题目：
 *      给你一个数组 prices ，其中 prices[i] 是商店里第 i 件商品的价格。
 *      商店里正在进行促销活动，如果你要买第 i 件商品，那么你可以得到与 prices[j] 相等的折扣，
 *      其中 j 是满足 j > i 且 prices[j] <= prices[i] 的 最小下标 ，如果没有满足条件的 j ，你将没有任何折扣。
 *      请你返回一个数组，数组中第 i 个元素是折扣后你购买商品 i 最终需要支付的价格
 *   PS:1 <= prices.length <= 500
 *      1 <= prices[i] <= 10^3
 * @Case:
 *       输入：prices = [8,4,6,2,3]
 *       输出：[4,2,4,2,3]
 *       解释：
 *       商品 0 的价格为 price[0]=8 ，你将得到 prices[1]=4 的折扣，所以最终价格为 8 - 4 = 4 。
 *       商品 1 的价格为 price[1]=4 ，你将得到 prices[3]=2 的折扣，所以最终价格为 4 - 2 = 2 。
 *       商品 2 的价格为 price[2]=6 ，你将得到 prices[3]=2 的折扣，所以最终价格为 6 - 2 = 4 。
 *       商品 3 和 4 都没有折扣
 * @思路：寻找该元素右边且小于自身的第一个元素。利用动态规划;暴力法
 */
public class LeetCode_1475 {
    public int[] finalPrices(int[] prices){
        int size=prices.length;
        int oldValue=0;
        for(int i=0,j=1;i<size && j<size;){
//            if(prices[i]==405){
//                System.out.println(prices[i]);
//            }
            if(j>i && prices[i]>=prices[j]){
                oldValue=prices[i];
                prices[i]-=prices[j];
                i++;
                if(i<j && prices[i]>oldValue){
                    if((i+1)<size){
                        j=i+1;
                    }
                }
            }else{
                if((j+1)<size) {
                    j++;
                }else{
                    oldValue=prices[i];
                    i++;
                    if(i<j && prices[i]>oldValue){
                        if((i+1)<size){
                            j=i+1;
                        }
                    }
                }
            }
        }
        return prices;
    }

    public static void main(String[] args){
        //int[] prices={5,5,10,8,9,7};//[0, 5, 2, 1, 2, 7]
        int[] prices={215,989,621,443,837,999,22,231,19,407,150,37,737,983,165,457,722,519,695,437,558,853,226,1000,646,817,712,529,462,229,537,665,32,405,692,590,823,329,676,647,437,61,756};
        //[193,368,178,421,815,977,3,212,19,257,113,5,572,818,133,20,203,82,258,211,332,627,194,354,117,105,183,67,233,197,505,633,32,76,102,261,494,268,29,210,376,61,756]
        System.out.println(Arrays.toString(new LeetCode_1475().finalPrices(prices)));
    }
}
