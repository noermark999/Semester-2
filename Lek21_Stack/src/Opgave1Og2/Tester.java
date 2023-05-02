package Opgave1Og2;

public class Tester {
    public static void main(String[] args) {
        Stack arrayStack = new ArrayStack();
        arrayStack.push("Elefant");
        arrayStack.push("Pingvin");
        arrayStack.push("Abe");
        arrayStack.push("Haj");
        arrayStack.push("Næsehorn");
        arrayStack.push("Løve");

        System.out.println(arrayStack);

        System.out.print("Peek: ");
        System.out.println(arrayStack.peek());

        System.out.println("Popper 2 gange");
        arrayStack.pop();
        arrayStack.pop();

        System.out.println(arrayStack);

        System.out.println("Opgave 2");
        System.out.println();

        Stack nodeStack = new NodeStack();
        nodeStack.push("Elefant");
        nodeStack.push("Pingvin");
        nodeStack.push("Abe");
        nodeStack.push("Haj");
        nodeStack.push("Næsehorn");
        nodeStack.push("Løve");

        System.out.println(nodeStack);

        System.out.print("Peek: ");
        System.out.println(nodeStack.peek());

        System.out.println("Popper 2 gange");
        nodeStack.pop();
        nodeStack.pop();

        System.out.println(nodeStack);

    }
}
