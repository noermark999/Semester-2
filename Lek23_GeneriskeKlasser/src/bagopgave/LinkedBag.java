package bagopgave;

public class LinkedBag<E> implements Bag<E>{

    Node<E> first = null;
    int currentSize = 0;
    int maxSize = 22;
    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public boolean isFull() {
        return currentSize == maxSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if (!isFull()) {
            first = new Node<>(newEntry, first);
            currentSize++;
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        E removed = first.data;
        first = first.next;
        currentSize--;
        return removed;
    }

    @Override
    public boolean remove(E anEntry) {
        Node<E> temp = first;
        while (temp.next != null) {
            if (temp.next.data == anEntry) {
                Node<E> removed = temp.next;
                temp.next = removed.next;
                currentSize--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public void clear() {
        first.next = null;
        first = null;
        currentSize = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int result = 0;
        Node<E> temp = first;
        while (temp != null) {
            if (temp.data == anEntry) {
                result++;
            }
            temp = temp.next;
        }
        return result;
    }

    @Override
    public boolean contains(E anEntry) {
        Node<E> temp = first;
        while (temp != null) {
            if (temp.data == anEntry) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public E[] toArray() {
        E[] array = (E[]) new Object[currentSize];
        int index = 0;
        Node<E> temp = first;
        while (temp != null) {
            array[index] = temp.data;
            index++;
            temp = temp.next;
        }
        return array;
    }
    class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

}
