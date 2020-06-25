package com.linyi.hdacm;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午12:29 2020/6/25
 * @Modify:
 * @Description:不能直接相乘，防止结果溢出
 */
public class ACM_1001 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            int sum=0;
            if(a<0){
                continue;
            }
            for(int i=1;i<=a;i++){
                sum+=i;
            }
            System.out.println(sum);
            System.out.println();
        }
        sc.close();
    }
}
