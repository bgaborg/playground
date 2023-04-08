package org.gabota.neetcode.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    Map<Integer, Integer> m = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            int cn = nums[i];
            int d = target - cn;
            //
            // note: containsKey is faster than get!
            //
            if (m.containsKey(d)) {
                return new int[] {m.get(d), i};
            }
            m.put(cn, i);
        }
        return null;
    }
}
