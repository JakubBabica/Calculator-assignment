package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
    }

    private static void stackOfIntegers() throws Exception {

        Stack<Object> stack = new Stack();
        ArrayList<Token> list = new ArrayList<>();
        list.add(new Operand(3) );
        list.add(new Operand(4));
        list.add(new Operand(8));
        list.add(new Operator('+'));
        list.add(new Operator('*'));
        System.out.println("2.1. Size of stack after push operations: " + stack.size());

    System.out.println("result is "+stack.evaluateExpression(list));

        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
}
}