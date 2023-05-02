package Opgave4;

import Opgave1Og2.NodeStack;
import Opgave1Og2.Stack;

public class DropOutStackNode implements Stack {
    private Node first;
    private int index;
    private int size;

    public DropOutStackNode(int size) {
        this.size = size;
        first = null;
        index = 0;
    }

    @Override
    public void push(Object element) {
        Node temp = first;
        if (index == size-1) {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = first;
            first = newNode;
            index++;

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object peek() {
        return first.data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        Node temp = first;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data).append(", ");
            temp = temp.next;
        }
        return "NodeStack: " + sb;
    }

    class Node {
        public Object data;
        public Node next;
    }
}
