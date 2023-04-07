package org.gabota.neetcode.heepprioqueue;

import java.util.*;

public class MinimumAbsoluteDifference {
    // https://leetcode.com/problems/minimum-absolute-difference/

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ll = new LinkedList<>();

        int minDiff = Integer.MAX_VALUE;
        for (int i=0; i<arr.length-1; i++) {
            int aDiff = Math.abs(arr[i] - arr[i+1]);
            if (aDiff < minDiff) {
                minDiff = aDiff;
                ll.clear();
            }
            if (aDiff == minDiff) {
                ll.add(new LinkedList<>(Arrays.asList(arr[i], arr[i+1])));
            }
        }

        return ll;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifference mad = new MinimumAbsoluteDifference();
        int[] arr = {-63,162,-146,33,-26,-34,-32,74,77,83,-104,155,-47,25,-74,171,-120,164};
        List<List<Integer>> res = mad.minimumAbsDifference(arr);
        System.out.println(res);
    }
}
