package Opgave3;

import Opgave2.SortedLinkedList;

public class SortedLinkedListDouble {

	private Node first;
	private Node last;
	private int size;

	public SortedLinkedListDouble() {
		first = null;
		last = null;
		size = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		Node newNode = new Node();
		newNode.data = e;
		Node temp = first;
		if (temp == null) {
			newNode.next = null;
			newNode.prev = null;
			last = newNode;
			first = newNode;
		} else if (temp.data.compareTo(e) >= 0) {
			newNode.next = temp;
			newNode.prev = null;
			temp.prev = newNode;
			last = temp;
			first = newNode;
		} else {
			while (temp.next != null && temp.next.data.compareTo(e) < 0 ) {
				temp = temp.next;
			}
			if (temp.next != null) {
				newNode.next = temp.next;
				temp.next.prev = newNode;
				newNode.prev = temp;
				temp.next = newNode;
			} else {
				newNode.next = null;
				newNode.prev = temp;
				temp.next = newNode;
				last = newNode;
			}
		}
		size++;
	}

	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
		if (first != null) {
			if (first.data.equals(e)) {
				first.next.prev = null;
				first = first.next;
				size--;
				return true;
			} else {
				Node temp = first;
				boolean found = false;
				while (!found && temp.next != null) {
					if (temp.next.data.equals(e)) {
						found = true;
					} else {
						temp = temp.next;
					}
				}
				if (found) {
					Node temp2 = temp.next;
					temp.next = temp2.next;
					if (temp.next != null) {
						temp.next.prev = temp;
					} else {
						last = temp;
					}
					temp2.next = null;
					size--;
					return true;
				}
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge 
	 */
	public void udskrivElements() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivBagfra() {
		Node temp = last;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}

	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		return size;
	}

	// Privat indre klasse der modellerer en node i en dobbeltkædet liste
	class Node {
		public String data;
		public Node next;
		public Node prev;
	}
}
