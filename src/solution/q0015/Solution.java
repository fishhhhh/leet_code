package solution.q0015;

import java.util.*;

public class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) {
            return lists;
        } else if (nums[0] == 0 && nums[nums.length - 1] == 0) {
            lists.add(new ArrayList<Integer>() {{
                    add(0);
                    add(0);
                    add(0);
            }});
            return lists;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {   // 避免重复
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    lists.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) {   // 避免重复
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {   // 避免重复
                        r--;
                    }
                    l++;
                    r--;
                } else if (nums[l] + nums[r] < -nums[i]) {
                    while (l < r && nums[l] == nums[l + 1]) {   // 避免重复
                        l++;
                    }
                    l++;
                } else {
                    while (l < r && nums[r] == nums[r - 1]) {   // 避免重复
                        r--;
                    }
                    r--;
                }
            }
        }
        return lists;
    }
}
