package Opgave1Og2;

public class NodeStack implements Stack {

    private Node first;
    private int numberOfElements;

    @Override
    public void push(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        numberOfElements++;
    }

    @Override
    public Object pop() {
        Object removed = first;
        first = first.next;
        numberOfElements--;
        return removed;
    }

    @Override
    public Object peek() {
        return first.data;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public int size() {
        return numberOfElements;
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
