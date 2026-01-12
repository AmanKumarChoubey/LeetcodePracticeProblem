package LeetCodePracticeCode.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //code here.
        Arrays.sort(strs);
        int n=strs.length;
        String firstWord=strs[0], lastWord=strs[n-1];
        StringBuilder  sb=new StringBuilder();
        for(int i=0;i<firstWord.length();i++){
            if(firstWord.charAt(i)!=lastWord.charAt(i)){
                break;
            }
            sb.append(firstWord.charAt(i));
        }
        return sb.toString();
    }
}
