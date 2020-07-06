package com.linyi.common;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:53 2020/7/3
 * @Modify:
 * @Description:
 */
public class Test {
    public int partition(int[] a, int low, int high) {

        // 三数取中,将中间元素放在第一个位置
//        if (a[low] > a[high]) {swap(a, low, high);}
//        if (a[(low + high) / 2] > a[high]) {swap(a, (low + high) / 2, high);}
//        if (a[low] < a[(low + high) / 2]) {swap(a, (low + high) / 2, low);}

        int pivotKey = a[low]; // 用第一个元素作为基准元素
        while (low < high) { // 两侧交替向中间扫描
            while (low < high && a[high] >= pivotKey) {high--;}
            a[low] = a[high];
            // swap(a, low, high); //比基准小的元素放到低端
            while (low < high && a[low] <= pivotKey) {low++;}
            a[high] = a[low];
            // swap(a, low, high); //比基准大的元素放到高端
        }
        a[low] = pivotKey; // 在中间位置放回基准值
        return low; // 返回基准元素所在位置
    }

    public void swap(int[] a, int i, int j) {
        int temp;
        temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public void qSort2(int[] a) {
        int pivot;
        int low=0;
        int high=a.length-1;
        if (low >= high) {return;}
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(low);
        stack.push(high);
        while (!stack.empty()) {
            // 先弹出high,再弹出low
            high = stack.pop();
            low = stack.pop();
            pivot = partition(a, low, high);
            // 先压low,再压high
            if (low < pivot - 1) {
                stack.push(low);
                stack.push(pivot - 1);
            }
            if (pivot + 1 < high) {
                stack.push(pivot + 1);
                stack.push(high);
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args){
        int[] nums={1,2,3};
        new Test().qSort2(nums);
    }
}
