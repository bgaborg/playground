package org.gabota.neetcode.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class e01ContainsDuplicate {
    Set<Integer> values = new HashSet<>();

    public boolean containsDuplicate(int[] nums) {
        for(int num : nums) {
            if (values.contains(num)) {
                return true;
            }
            values.add(num);
        }

        return false;
    }
}
