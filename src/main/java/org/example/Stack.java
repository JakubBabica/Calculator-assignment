package org.example;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class Stack<T>{
    private LinkedList stack;
    public Stack() {
        stack = new LinkedList();
    }
    public int evaluateExpression(ArrayList<Object> tokens) throws Exception {
        for (int i = 0; i < tokens.size(); i++) {
            Object obj = tokens.get(i);
            if (obj instanceof Integer) {
                stack.push(obj);
            } else if (obj.equals("+")) {
                int n1 = (int) stack.pop();
                int n2 = (int) stack.pop();
                stack.push(n1 + n2);
            } else if (obj.equals("-")) {
                int n1 = (int) stack.pop();
                int n2 = (int) stack.pop();
                stack.push(n1 - n2);
            } else if (obj.equals("*")) {
                int n1 = (int) stack.pop();
                int n2 = (int) stack.pop();
                stack.push(n1 * n2);
            } else if (obj.equals("/")) {
                int n1 = (int) stack.pop();
                int n2 = (int) stack.pop();
                stack.push(n1 / n2);
            }
            throw new Exception("incorrect input");
        }
        return (int) stack.get(0);
    }
    public void push(T element) {
        stack.addFirst(element);
    }
    public T pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return stack.size();
    }
}
