package n2;

import java.util.LinkedList;

public class LinkedQueue<E> implements Queue<E> {
    private LinkedList<E> elements = new LinkedList<>();

    @Override
    public void enqueue(E element) {
        elements.addLast(element);
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return elements.removeFirst();
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return elements.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public void clear() {
        elements.clear();
    }
}
