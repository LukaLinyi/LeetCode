package com.linyi.leetcode.leetcode_1001_1500;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 下午1:08 2020/6/29
 * @Modify:
 * @Description: leetCode 1436
 * @题目：
 *      给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，
 *      其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。
 *      请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
 *      题目数据保证线路图会形成一条不存在循环的线路，因此只会有一个旅行终点站。
 *   PS:1 <= paths.length <= 100;
 *      paths[i].length == 2;
 *      1 <= cityAi.length, cityBi.length <= 10;
 *      cityAi != cityBi;
 *      所有字符串均由大小写英文字母和空格字符组成
 * @Case:输入：paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 *       输出："Sao Paulo"
 *       解释：从 "London" 出发，最后抵达终点站 "Sao Paulo" 。本次旅行的路线是 "London" -> "New York" -> "Lima" -> "Sao Paulo"
 * @思路:以每组路线的目标城市构建hash表，以每组路线的出发城市去碰撞hash表，存在则hash数组的值加1，取最后hash数组值为0；
 *      以每组路线的出发城市构建hash表，以每组路线的目的城市去碰撞hash表，如存在则不是终点站，不存在则是终点站。
 */
public class LeetCode_1436 {
    public String destCity(List<List<String>> paths){
        HashMap<String,String> startCity=new HashMap<>();
        Iterator<List<String>> iterator=paths.iterator();
        String destCity="";
        while(iterator.hasNext()){
            startCity.put(iterator.next().get(0),"exist");
        }
        iterator=paths.iterator();
        while(iterator.hasNext()){
            destCity=iterator.next().get(1);
            if(null==startCity.get(destCity)){
                break;
            }
        }
        return destCity;
    }
}
