package Opgave2;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

	private Node start;
	private int size;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryLinked() {
		// Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		Node temp = start;
		while (temp.next != null) {
			if (temp.next.key.equals(key)) {
				return temp.next.value;
			}
			temp = temp.next;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		if (key == null || value == null) {
			throw  new IllegalArgumentException("Key eller value må ikke være null");
		}
		Node temp = start;
		while (temp.next != null) {
			if (temp.next.key.equals(key)) {
				V oldValue = temp.next.value;
				temp.next.value = value;
				return oldValue;
			}
			temp = temp.next;
		}
		Node nodePut = new Node();
		nodePut.value = value;
		nodePut.key = key;
		nodePut.next = start.next;
		start.next = nodePut;
		size++;
		return null;
	}

	@Override
	public V remove(K key) {
		Node temp = start;
		V removedValue;
		while (temp.next != null) {
			if (temp.next.key.equals(key)) {
				removedValue = temp.next.value;
				temp.next = temp.next.next;
				size--;
				return removedValue;
			}
			temp = temp.next;
		}
		return null;
	}

	@Override
	public int size() {

		return size;
	}

	private class Node {
		Node next;
		K key;
		V value;
	}

}
