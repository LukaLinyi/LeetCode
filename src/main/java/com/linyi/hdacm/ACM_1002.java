package com.linyi.hdacm;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午12:59 2020/6/25
 * @Modify:
 * @Description:大数据相加，结果可能溢出，使用BigInter
 */
public class ACM_1002 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int caseCount=sc.nextInt();
        int times=1;
        while(times<=caseCount){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();

            System.out.println("Case "+times+":");
            System.out.println(a+" + "+b+" = "+a.add(b));
            if(caseCount>1 && times!=caseCount) {
                System.out.println();
            }
            times++;
        }
    }
}
