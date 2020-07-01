package com.linyi.leetcode.leetcode_1001_1500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午8:47 2020/7/1
 * @Modify:
 * @Description: leetcode 1370
 * @思路：首先将字符串映射成int['字符']，值为字符的数量；随后用游标在最大和最小值之间扫描即可
 */
public class LeetCode_1370 {
    public String sortString(String s){
        int[] chars=new int[26];
        StringBuilder sb=new StringBuilder();
        char minChar='a';
        char maxChar='a';
        boolean incr=true;
        boolean stopStep=false;
        int strlen=s.length();
        for(char c:s.toCharArray()){
            chars[c-'a']++;
            if(minChar>c){
                minChar=c;
            }
            if(maxChar<c){
                maxChar=c;
            }
        }
        for(int i=minChar,k=0;i>=minChar && i<=maxChar && k<strlen;){
            if(chars[i-'a']>0) {
                sb.append((char)i);
                chars[i-'a']--;
                k++;
            }
            if(incr){
                if(stopStep){
                    i=minChar;
                }else {
                    i++;
                }
            }else{
                if(stopStep){
                    i=maxChar;
                }else {
                    i--;
                }
            }
            if(i==maxChar){
                incr=false;
                stopStep=stopStep?false:true;
            }
            if(i==minChar){
                incr=true;
                stopStep=stopStep?false:true;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(new LeetCode_1370().sortString("aaaabbbbcccc"));
    }
}
