package Opgave2;

public class App {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.addElement("Cactus");
        list.addElement("Abe");
        list.addElement("Banan");
        list.addElement("Plante");
        list.addElement("Fugl");
        list.addElement("Engel");
        list.udskrivElements();

        System.out.println();
        System.out.println("Remove last");
        list.removeLast();
        list.udskrivElements();

        System.out.println();
        System.out.println("Remove Abe");
        list.removeElement("Abe");
        list.udskrivElements();


        System.out.println();
        System.out.println("Remove Engel");
        list.removeElement("Engel");
        list.udskrivElements();


        System.out.println();
        System.out.println("Test opgave 4");
        SortedLinkedList list2 = new SortedLinkedList();
        list2.addElement("Drage");
        list2.addElement("Giraf");
        list2.addElement("Zebra");
        list.addAll(list2);
        list.udskrivElements();

        System.out.println();
        System.out.println("Test Opgave 5");
        System.out.println("Normal: " + list.countElements());
        System.out.println("Recursive " + list.countElementsRec());
    }
}
