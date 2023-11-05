package cn.leetcode.order1_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by laoazhang on 18:29 14/08/2022
 */
public class Code01 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

}
