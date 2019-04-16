package solution.q0020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    
    private Map<Character, Character> map = new HashMap<Character, Character>(){{
        put( '(', ')' );
        put( '[', ']' );
        put( '{', '}' );
    }};
    
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (null != map.get(c)) {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else {
                Character pop = stack.pop();
                if (map.get(pop) != c) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
