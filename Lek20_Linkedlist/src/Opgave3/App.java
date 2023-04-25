package Opgave3;

public class App {
    public static void main(String[] args) {
        SortedLinkedListDouble list = new SortedLinkedListDouble();
        list.addElement("Cactus");
        list.addElement("Abe");
        list.addElement("Banan");
        list.addElement("Plante");
        list.addElement("Fugl");
        list.addElement("Engel");
        System.out.println("Forfra: " + " størrelse: " + list.countElements());
        list.udskrivElements();

        System.out.println();
        System.out.println("Bagfra " + " størrelse: " + list.countElements());
        list.udskrivBagfra();

        list.removeElement("Engel");
        System.out.println();
        System.out.println("Forfra: " + " størrelse: " + list.countElements());
        list.udskrivElements();
        System.out.println();
        System.out.println("Bagfra " + " størrelse: " + list.countElements());
        list.udskrivBagfra();

        list.removeElement("Plante");
        System.out.println();
        System.out.println("Forfra: " + " størrelse: " + list.countElements());
        list.udskrivElements();
        System.out.println();
        System.out.println("Bagfra " + " størrelse: " + list.countElements());
        list.udskrivBagfra();

    }
}
