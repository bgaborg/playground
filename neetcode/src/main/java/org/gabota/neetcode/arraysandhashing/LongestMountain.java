package org.gabota.neetcode.arraysandhashing;

import java.util.LinkedList;
import java.util.List;


public class LongestMountain {
    // https://leetcode.com/problems/longest-mountain-in-array/description/
    public static int longestPeak(final int[] arr) {
        List<Integer> peeks = new LinkedList<>();
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                peeks.add(i);
            }
        }

        int maxPeak = 0;
        int currentPeak;

        for (Integer peek : peeks) {
            currentPeak = 1;
            for (int i = peek; (i > 0) && (arr[i] > arr[i-1]); i--) {
                currentPeak++;
            }
            for (int i = peek; (i < arr.length - 1) && (arr[i] > arr[i+1]); i++) {
                currentPeak++;
            }
            maxPeak = Math.max(currentPeak, maxPeak);
        }

        return maxPeak;
    }

    /**
     * new int[]{1, 3, 2}, 3, "whole array is a peak"
     * new int[]{5, 4, 3, 2, 1, 2, 10, 12}, 0, "no peak"
     * new int[]{1, 2, 3, 4, 5, 1}, 6, "peak at the start of the array"
     */

    public static void main(String[] args) {
        System.out.println(longestPeak(new int[]{1, 3, 2}));
//        System.out.println(longestPeak(new int[]{5, 4, 3, 2, 1, 2, 10, 12}));
//        System.out.println(longestPeak(new int[]{1, 2, 3, 4, 5, 1}));
    }

}
