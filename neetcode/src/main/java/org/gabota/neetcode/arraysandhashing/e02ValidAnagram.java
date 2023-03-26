package org.gabota.neetcode.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class e02ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> letters = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int count = letters.getOrDefault(c, 0);
            letters.put(c, count + 1);
        }

        for (int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            int count = letters.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            } else {
                letters.put(c, count - 1);
            }
        }
        return true;
    }

    public boolean isAnagramOptimized(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] store = new int[26];
        for (int i=0; i<s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        // remember that length is an attribute of an array
        for (int i=0; i < store.length; i++) {
            if (store[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
