package LeetCodePracticeCode.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStrWithoutRepChar {
    public int lengthOfLongestSubstring(String s) {
        // code here.
        Set<Character> set = new HashSet<>();
        int acquire = 0, release = 0, ans = 0;
        while (acquire < s.length()) {
            if (!set.contains(s.charAt(acquire))) {
                set.add(s.charAt(acquire));
                acquire++;
                ans = Math.max(ans, set.size());
            } else {
                set.remove(s.charAt(release));
                release++;
            }
        }
        return ans;
    }
}
