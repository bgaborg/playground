package org.gabota.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class e01ValidParentheses {
    Deque<Character> cL = new ArrayDeque<Character>();

    public boolean isValid(String s) {
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            try{
                switch (c) {
                    case '[' -> cL.push(c);
                    case ']' -> {
                        if (cL.pop() != '[') return false;
                    }
                    case '(' -> cL.push(c);
                    case ')' -> {
                        if (cL.pop() != '(') return false;
                    }
                    case '{' -> cL.push(c);
                    case '}' -> {
                        if (cL.pop() != '{') return false;
                    }
                }
            } catch (Exception e) {
                return false;
            }
        }
        return cL.size() == 0;
    }
}
