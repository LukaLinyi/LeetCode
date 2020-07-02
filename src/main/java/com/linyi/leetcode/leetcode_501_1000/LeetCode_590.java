package com.linyi.leetcode.leetcode_501_1000;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午10:03 2020/7/1
 * @Modify:
 * @Description: leetcode 590
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class LeetCode_590 {
    public List<Integer> postorder(Node root){
        List<Integer> list=new ArrayList<>();
        if(null==root){
            return list;
        }
        Stack<Node> stack=new Stack<>();
        Node point=root;
        boolean allChildrenVisit=false;
        while(true){
            if(null!=point && null!=point.children && !point.children.isEmpty() && !allChildrenVisit){
                stack.push(point);
                point=point.children.get(0);
            }else{
                if(!stack.isEmpty()) {
                    list.add(point.val);
                    boolean hasFindMyself=false;
                    Node nextBrother=null;
                    for (Node node : stack.peek().children) {
                        if (point == node) {
                            hasFindMyself = true;
                            continue;
                        }
                        if (hasFindMyself) {
                            if (null != node) {
                                nextBrother = node;
                                break;
                            }
                        }
                    }
                    if (null == nextBrother || point == nextBrother) {//point==nextBrother或者nextBrother为空，说明已经搜索到最后一个兄弟节点
                        point = stack.pop();//point指向父节点
                        allChildrenVisit = true;
                    } else {
                        point = nextBrother;//point指向下一个兄弟节点
                        allChildrenVisit = false;
                    }
                }else{//栈空了，直接跳出
                    break;
                }
            }
        }
        list.add(point.val);
        return list;
    }

    public List<Integer> postorderV2(Node root){
        List<Integer> list=new ArrayList<>();
        if(null==root){
            return list;
        }
        Stack<Node> stack=new Stack<>();
        Node point=root;
        stack.push(point);
        boolean allChildrenVisit=false;
        while(!stack.isEmpty()){
            if(null!=point && null!=point.children && !point.children.isEmpty() && !allChildrenVisit){
                point=point.children.get(0);
                stack.push(point);
            }else{
                point=stack.pop();
                list.add(point.val);
                if(stack.isEmpty()){
                    return list;
                }
                boolean hasFindMyself=false;
                Node nextBrother=null;
                for (Node node : stack.peek().children) {
                    if (point == node) {
                        hasFindMyself = true;
                        continue;
                    }
                    if (hasFindMyself) {
                        if (null != node) {
                            nextBrother = node;
                            break;
                        }
                    }
                }
                if (null == nextBrother || point == nextBrother) {//point==nextBrother或者nextBrother为空，说明已经搜索到最后一个兄弟节点
                    allChildrenVisit = true;
                } else {
                    point = nextBrother;//point指向下一个兄弟节点
                    stack.push(point);
                    allChildrenVisit = false;
                }
            }
        }
        list.add(point.val);
        return list;
    }

    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        //[1,null,3,2,4,null,5,6]

        List<Node> leftChildTreeChildren=new ArrayList<>();
        leftChildTreeChildren.add(new Node(1));
        leftChildTreeChildren.add(null);
        leftChildTreeChildren.add(new Node(3));
        Node leftNode=new Node(2,leftChildTreeChildren);

        List<Node> rightChildTreeChildren=new ArrayList<>();
        rightChildTreeChildren.add(new Node(4));
        rightChildTreeChildren.add(null);
        Node rightNode=new Node(5,rightChildTreeChildren);

        List<Node> rootChildren=new ArrayList<>();
        rootChildren.add(leftNode);
        rootChildren.add(rightNode);
        Node root=new Node(6,rootChildren);
        System.out.println(new LeetCode_590().postorderV2(root));
    }
}
