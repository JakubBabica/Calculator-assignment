package org.example;

import java.util.EmptyStackException;
import java.util.LinkedList;
public class Stack<T> {
    private LinkedList stack;
    public Stack() {
        stack = new LinkedList();
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
