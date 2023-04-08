package org.gabota.neetcode.stack;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> sstack = new Stack<>();
        for (String op : operations) {
            switch (op) {
                case "+" -> {
                    int f = sstack.pop();
                    int s = sstack.peek();
                    sstack.push(f);
                    sstack.push(f + s);
                }
                case "D" -> sstack.push(sstack.peek() * 2);
                case "C" -> sstack.pop();
                default -> sstack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(!sstack.empty()) {
            sum += sstack.pop();
        }
        return sum;
    }
}
