package org.gabota.neetcode.twopointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        // clean all non-letter chars
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            /*
             * Also works: Character.isLetterOrDigit(c)
             */
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9')
                sb.append(c);
        }
        s = sb.toString();

        for (int i=0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("0P"));
    }
}
