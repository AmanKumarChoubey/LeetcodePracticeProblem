package LeetCodePracticeCode.Strings;

public class CheckStringInRotateStr {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String result=s+s;
        if(result.contains(goal)){
            return true;
        }
        return false;
    }
}
