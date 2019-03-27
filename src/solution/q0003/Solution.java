package solution.q0003;

import java.util.HashMap;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxSize = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < length; end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)), start);
            }
            maxSize = Math.max(maxSize, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return maxSize;
    }
}
