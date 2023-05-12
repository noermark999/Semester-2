package QueueOpgaver.queue;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    Node node = new Node();
    private int currentsize;
    private int tail;
    private int head;
    /**
     * Constructs an empty queue.
     */
    public NodeQueue()
    {
        // TODO: Assignment 1: Implement this constructor...
    }

    @Override
    public void enqueue(Object element)
    {
        // TODO: Assignment 1: Implement this method...

        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Object dequeue()
    {
        // TODO: Assignment 1: Implement this method...

        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int size()
    {
        // TODO: Assignment 1: Implement this method...

        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean isEmpty()
    {
        // TODO: Assignment 1: Implement this method...

        throw new UnsupportedOperationException("Not implemented");
    }

    class Node
    {
        public Object data;
        public Node next;
    }
}
