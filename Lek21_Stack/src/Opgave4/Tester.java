package Opgave4;

import Opgave1Og2.Stack;

public class Tester {
    public static void main(String[] args) {
        //Stack stack = new DropOutStackArray(3);
        Stack stack = new DropOutStackNode(3);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());

        //stack.push("4");
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());

        /*
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());

        stack.push("5");
        stack.push("6");
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());
        stack.push("7");
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());

         */
    }
}
