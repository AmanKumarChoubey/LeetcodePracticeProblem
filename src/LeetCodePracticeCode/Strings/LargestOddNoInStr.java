package LeetCodePracticeCode.Strings;

public class LargestOddNoInStr {
    public String largestOddNumber(String num) {
        //code here.
        String ans = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            int temp = num.charAt(i) - '0';
            if (temp % 2 != 0) {
                //means odd number so,
                ans = num.substring(0, i + 1);
                break;
            }
        }
        return ans;
    }
}
