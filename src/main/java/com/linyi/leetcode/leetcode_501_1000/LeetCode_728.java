package com.linyi.leetcode.leetcode_501_1000;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:47 2020/7/2
 * @Modify:
 * @Description: leetcode 728
 * @思路：
 *      1，使用暴力破解，将整数转成字符串，且注意除数为零的情况
 *      2，空间换时间，提前构造自除数集合，只需顺序扫描即可。
 */
public class LeetCode_728 {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> list=new ArrayList<>();
        int tmp=0;
        boolean isSelfDivid=true;
        for(int i=left;i<=right;i++){
            if(i<10){
                list.add(i);
            }else{
                tmp=i;
                isSelfDivid=true;
                while(tmp>0){
                    if((tmp%10)!=0 && i%(tmp%10)==0){
                        tmp=tmp/10;
                    }else{
                        isSelfDivid=false;
                        break;
                    }
                }
                if(isSelfDivid){
                    list.add(i);
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_728().selfDividingNumbers(1,22).toArray().toString());
    }
}
