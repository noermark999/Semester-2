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

    }
}
