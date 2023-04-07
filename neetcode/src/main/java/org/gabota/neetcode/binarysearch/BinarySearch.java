package org.gabota.neetcode.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

import static org.gabota.neetcode.FileReader.getReader;
import static org.gabota.neetcode.FileReader.readAsIntArray;

public class BinarySearch {
    // https://leetcode.com/problems/binary-search/

    public static int search(int[] nums, int target) {
        int i, j;

        i = 0;
        j = nums.length - 1;

        if (nums[i] == target) return i;
        if (nums[j] == target) return j;

        while (i+1 !=j && j-1 != i) {
            int m = (i + j) / 2;
            if (nums[m] == target) return m;
            if (target > nums[m]) {
                i = m;
            } else {
                j = m;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        int[] testarr;
        try (BufferedReader reader = getReader(Thread.currentThread(), "binsearch_array.txt")) {
            String line = reader.readLine();
            testarr = readAsIntArray(line);
        }

        System.out.println(search(testarr, 988));
    }


}
