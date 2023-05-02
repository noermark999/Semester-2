package Opgave1Og2;

public class ArrayStack implements Stack {
    private Object[] objects;
    private int numberOfElements;

    public ArrayStack() {
        objects = new Object[5];
        numberOfElements = 0;
    }


    @Override
    public void push(Object element) {
        checkSpace();
        objects[numberOfElements] = element;
        numberOfElements++;
    }

    @Override
    public Object pop() {
        Object removed = objects[numberOfElements-1];
        objects[numberOfElements-1] = null;
        numberOfElements--;
        return removed;
    }

    @Override
    public Object peek() {
        return objects[numberOfElements-1];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    private void checkSpace() {
        if (objects.length == numberOfElements) {
            Object[] newObjects = new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
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
