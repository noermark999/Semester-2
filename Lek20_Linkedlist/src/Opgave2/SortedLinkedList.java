package Opgave2;

import Opgave1.citylinkedlist.CityList;

public class SortedLinkedList {

	// TODO hvilke feltvariable skal klassen have
	private Node first;

	public SortedLinkedList() {
		first = null;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		Node newNode = new Node();
		newNode.data = e;
		Node temp = first;
		if (temp == null || temp.data.compareTo(e) >= 0) {
			newNode.next = temp;
			first = newNode;
		} else {
			while (temp.next != null && temp.next.data.compareTo(e) < 0 ) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
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
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		int count = 0;
		Node temp = first;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public int countElementsRec() {
		int count = 0;
		Node temp = first;
		count += countElementsRecHelper(temp);
		return count;
	}

	public int countElementsRecHelper(Node node) {
		int count = 0;
		if (node != null) {
			count++;
			count += countElementsRecHelper(node.next);
		}
		return count;
	}

	
	/**
	 * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis der blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeLast() {
		Node temp = first;
		if (temp != null) {
			Node temp2 = temp.next;
			while (temp2.next != null) {
				temp = temp2;
				temp2 = temp.next;
			}
			temp.next = null;
			return true;
		} else {
			return false;
		}
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
				first = first.next;
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
					temp2.next = null;
					return true;
				}
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Tilføjer alle elementerne fra list til den aktuelle liste.
	 * Listen er fortsat sorteret i henhold til den naturlige ordning på
	 * elementerne.
	 */
	public void addAll(SortedLinkedList list) {
		Node temp = list.first;
		while (temp != null) {
			addElement(temp.data);
			temp = temp.next;
		}
	}
	
	// Privat indre klasse der modellerer en node i listen
	private class Node {
		public String data;
		public Node next;
	}
}
