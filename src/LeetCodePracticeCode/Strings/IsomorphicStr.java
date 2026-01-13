package LeetCodePracticeCode.Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStr {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length(), m = t.length();
        Map<Character, Character> map = new HashMap<>();
        if (n != m) return false;
        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) return false;
            } else if (map.containsValue(ch2)) {
                return false;
            } else {
                map.put(ch1, ch2);
            }
        }
        return true;
    }
}
