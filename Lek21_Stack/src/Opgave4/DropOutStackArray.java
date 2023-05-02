package Opgave4;

import Opgave1Og2.Stack;

public class DropOutStackArray implements Stack {
    private Object[] objects;
    private int index;
    private int size;
    private int bottomIndex;

    public DropOutStackArray(int size) {
        this.size = size;
        index = 0;
        objects = new Object[size];
    }


    @Override
    public void push(Object element) {
        if (isEmpty()) {
            objects[index] = element;
            bottomIndex = 0;
            index++;
        } else if (objects[index] == null) {
            objects[index] = element;
            if (index == size-1) {
                index = 0;
            } else {
                index++;
            }
        } else {
            objects[index] = element;
            if (index == size-1) {
                index = 0;
            } else {
                index++;
            }
            bottomIndex = index;
        }
    }

    @Override
    public Object pop() {
        if (index != 0) {
            index--;
        } else {
            index = size-1;
        }
        Object removed = objects[index];
        objects[index] = null;
        return removed;
    }

    @Override
    public Object peek() {
        int peekindex = index;
        if (peekindex != 0) {
            peekindex--;
        } else {
            peekindex = size-1;
        }
        return objects[peekindex];
    }

    @Override
    public boolean isEmpty() {
        return objects[bottomIndex] == null;
    }

    @Override
    public int size() {
        int result = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                result++;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                sb.append(objects[i]).append(", ");
            }
        }
        return "ArrayStack: " + sb.toString();
    }
}
