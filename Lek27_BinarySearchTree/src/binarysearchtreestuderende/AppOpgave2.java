package binarysearchtreestuderende;

public class AppOpgave2 {
    public static void main(String[] args) {
        DictionaryBST2<String, Integer> tree = new DictionaryBST2<>();
        tree.put("A", 45);
        tree.put("B", 22);
        tree.put("C", 77);
        tree.put("D", 11);
        tree.put("E", 30);
        tree.put("F", 90);
        tree.put("G", 15);
        tree.put("H", 25);
        tree.put("I", 88);

        tree.print();
        System.out.println(tree.size());
        tree.remove("B");
        tree.remove("H");
        tree.remove("F");

        tree.print();
        System.out.println("Expected: A: 45 C: 77 D: 11 E: 30 G: 15 I: 88");
        System.out.println(tree.size());

        tree.put("I", 1032);
        tree.print();
        System.out.println(tree.size());
    }
}
