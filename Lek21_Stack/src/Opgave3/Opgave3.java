package Opgave3;

import Opgave1Og2.NodeStack;
import Opgave1Og2.Stack;

public class Opgave3 {
    public static void main(String[] args) {
        System.out.println(checkParenteses("(3+{5{99{*}}[23[{67}67]]})"));
        System.out.println(checkParenteses("(3(5)]"));
    }

    public static boolean checkParenteses(String s) {
        Stack stack = new NodeStack();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            switch (c) {
                case "(":
                case "{":
                case "[":
                    stack.push(c);
                    break;
                case ")":
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case "}":
                    if (stack.peek().equals("{")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case "]":
                    if (stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
