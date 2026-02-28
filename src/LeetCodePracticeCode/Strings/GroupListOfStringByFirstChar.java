import java.util.*;
class GroupListOfStringByFirstChar {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","apricot","cheety","blueberry");
        Map<Character,List<String>> grouped = groupedByFistLetter(words);
        System.out.println(grouped);
    }
    public static Map<Character,List<String>> groupedByFistLetter(List<String> words){
        Map<Character,List<String>> map=new HashMap<>();
        for(int i=0;i<words.size();i++){
            char ch=words.get(i).charAt(0);
        map.computeIfAbsent(ch, k -> new ArrayList<>()).add(words.get(i));
        
        }
        return map;
    }
}
