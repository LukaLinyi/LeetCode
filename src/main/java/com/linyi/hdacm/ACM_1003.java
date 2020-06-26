package com.linyi.hdacm;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午1:34 2020/6/25
 * @Modify:
 * @Description:动态规划，执行效率和空间有问题；方法maxSumOfSubNums采用压缩存储和计算时间，输入一个数据计算一次
 */
public class ACM_1003 {
    public void maxSumOfSubNumsV2(){
        Scanner sc=new Scanner(System.in);
        int caseCount=sc.nextInt();
        int[] maxSum=new int[20];//数组的下标测试case的组别
        int[] maxStartPos=new int[20];
        int[] maxEndPos=new int[20];
        int times=0;
        int tmpNum;//接收每次输入
        int tmpSum;//临时和
        int tmpStartPos;//当前子串的起始位置
        while(times<caseCount){
            tmpSum=0;
            tmpStartPos=1;
            maxSum[times]=-1001;
            maxStartPos[times]=0;
            maxEndPos[times]=0;
            int numsLength=sc.nextInt();
            for(int i=1;i<=numsLength;i++){//N个数输入并处理
                tmpNum=sc.nextInt();
                tmpSum+=tmpNum;
                if(tmpSum>maxSum[times]){//如果加上后和变大并且超过了最大和
                    maxSum[times]=tmpSum;//更新最大和
                    maxEndPos[times]=i;//更新结束位置
                    maxStartPos[times]=tmpStartPos;//初始位置保持不变
                }
                if(tmpSum<0){//如果加上后值为负，说明新加的数很小
                    tmpSum=0;//放弃之前的子串，重新计数
                    tmpStartPos=i+1;//开始位置更新为下一个位置
                }
            }
            System.out.println("Case "+(times+1)+":");
            System.out.println(maxSum[times]+" "+maxStartPos[times]+" "+maxEndPos[times]);
            if(caseCount>1 && times!=caseCount-1) {
                System.out.println();
            }
            times++;
        }
    }

    public void maxSumOfSubNumsV1(){
        Scanner sc=new Scanner(System.in);
        int caseCount=sc.nextInt();
        int times=1;
        int[] nums=new int[100000];
        while(times<=caseCount){
            int numsLength=sc.nextInt();
            int maxSum=0;
            int curSum=0;
            int maxStartPos=0;
            int maxEndPos=0;
            for(int i=0;i<numsLength;i++){
                nums[i]=sc.nextInt();
            }
            for(int i=0,k=0;k<numsLength && i<=k;){
                if(curSum+nums[k]>curSum){
                    curSum += nums[k];
                    if(curSum>maxSum){
                        maxSum=curSum;
                        maxEndPos=k;
                    }
                    k++;
                }else if(curSum-nums[i]>curSum){
                    curSum-=nums[i];
                    if(curSum>maxSum){
                        maxSum=curSum;
                        maxStartPos=i;
                    }
                    i++;
                }else if(curSum+nums[k]>=curSum-nums[i]){
                    curSum+=nums[k];
                    k++;
                }else{
                    curSum-=nums[i];
                    i++;
                }
            }
            System.out.println("Case "+times+":");
            System.out.println(maxSum+" "+(maxStartPos+1)+" "+(maxEndPos+1));
            if(caseCount>1 && times!=caseCount) {
                System.out.println();
            }
            times++;
        }
    }

    public static void main(String[] args){
        new ACM_1003().maxSumOfSubNumsV2();
    }
}
