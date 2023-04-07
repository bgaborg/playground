package org.gabota.neetcode.stack;

public class e03ImplementStackUsingQueues {
    // https://leetcode.com/problems/implement-stack-using-queues/

    public static class MyStack {
        int[] stack = new int[100];
        int r;

        public MyStack() {
            r = -1;
        }

        public void push(int x) {
            r++;
            stack[r] = x;
        }

        public int pop() {
            return stack[r--];
        }

        public int top() {
            return stack[r];
        }

        public boolean empty() {
            return r == -1;
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}
