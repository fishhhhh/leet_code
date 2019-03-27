package solution.q0001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    /**
     * Two sum int [ ].
     *
     * @param nums   the nums
     * @param target the target
     *
     * @return the int [ ]
     */
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.isEmpty() || !map.containsKey(value)) {
                map.put(nums[i], i);
            } else {
                return new int[] { map.get(value), i };
            }
        }
        return null;
    }
}
