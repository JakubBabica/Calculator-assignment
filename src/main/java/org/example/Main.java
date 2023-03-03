package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
    }

    private static void stackOfIntegers() {

        Stack<Object> stack = new Stack();
        ArrayList<Object> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add("+");
        System.out.println("2.1. Size of stack after push operations: " + stack.size());

//        System.out.println("reslut is "+stack.evaluateExpression(list));

        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
}
}