package com.linyi.leetcode.leetcode_501_1000;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午9:07 2020/7/6
 * @Modify:
 * @Description: leetcode 589
 * @思路：递归或者非递归
 */
public class LeetCode_589 {
    public List<Integer> preorder(Node root){
        List<Integer> list=new ArrayList<>();
        if(null==root){
            return list;
        }else{
            list.add(root.val);
            if(null==root.children){
                return list;
            }else{
                for(Node node:root.children){
                    List<Integer> tmpList=new ArrayList<>();
                    tmpList=preorder(node);
                    for(Integer integer:tmpList){
                        list.add(integer);
                    }
                }
            }
        }
        return list;
    }
}
