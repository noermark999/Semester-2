package binarysearchtreestuderende;

public class AppOpgave1 {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(45);
        tree.add(22);
        tree.add(77);
        tree.add(11);
        tree.add(30);
        tree.add(90);
        tree.add(15);
        tree.add(25);
        tree.add(88);

        tree.print();
        System.out.println("Max: " + tree.findMax());
        System.out.println("Min: " + tree.findMin());

        while (!tree.isEmpty()) {
            System.out.println("Removes: " + tree.removeMaxRec());
            tree.print();
        }
    }
}
