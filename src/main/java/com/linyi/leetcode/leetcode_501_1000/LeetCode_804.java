package com.linyi.leetcode.leetcode_501_1000;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午3:58 2020/7/1
 * @Modify:
 * @Description: leetcode 804
 */
public class LeetCode_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseBook={".-","-...","-.-.","-..",".","..-.","--.","....",
                        "..",".---","-.-",".-..","--","-.","---",".--.",
                        "--.-",".-.","...","-","..-","...-",".--","-..-",
                        "-.--","--.."};
        Set<String> set=new HashSet<String>();
        for(int i=0;i<words.length;i++){
            StringBuilder morseCode=new StringBuilder();
            for(char c:words[i].toCharArray()){
                morseCode.append(morseBook[c-'a']);
            }
            set.add(morseCode.toString());
        }
        return set.size();
    }
}
