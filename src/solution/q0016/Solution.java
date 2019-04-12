package solution.q0016;

import java.util.Arrays;

public class Solution {
    
    public int threeSumClosest(int[] nums, int target) {
        
        int result = 0;
        Arrays.sort(nums);
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length - 2; i++) {
                int l = i + 1;
                int r = nums.length - 1;
                if (i == 0) {
                    result = nums[i] + nums[l] + nums[r];
                }
                while (l < r) {
                    int val = nums[i] + nums[l] + nums[r];
                    if (target == val) {
                        return target;
                    } else {
                        if (Math.abs(target - val) < Math.abs(target - result)) {
                            result = val;
                        }
                        if (val > target) {
                            r--;
                        } else {
                            l++;
                        }
                    }
                }
            }
        }
        return result;
    }
}
