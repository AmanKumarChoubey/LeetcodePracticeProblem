package LeetCodePracticeCode.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharByFreq {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[]list=new List[s.length()+1];
        for(Character key:map.keySet()){
            int freq=map.get(key);
            if(list[freq]==null){
                list[freq]=new ArrayList<>();
            }
            list[freq].add(key);
        }
        for(int i=list.length-1;i>=0;i--){
            if(list[i]!=null){
                for(char ch:list[i]){
                    for(int j=0;j<map.get(ch);j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}
