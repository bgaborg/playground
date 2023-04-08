package org.gabota.neetcode.twopointers;

public class LongestPalindromaticSubstring {
    // https://leetcode.com/problems/longest-palindromic-substring/

    public String longestPalindrome(String s) {
        int longest = 0;
        String lS = "";

        for(int i=0; i<s.length(); i++) {
            int l = i;
            int r = i;
            while(l >= 0 && r < s.length() && s.charAt(r) == s.charAt(l)) {
                int d = r - l + 1;
                if (d > longest) {
                    longest = d;
                    lS = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }

        for(int i=0; i<s.length(); i++) {
            int l = i;
            int r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(r) == s.charAt(l)) {
                int d = r - l + 1;
                if (d > longest) {
                    longest = d;
                    lS = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }

        return lS;
    }
}
