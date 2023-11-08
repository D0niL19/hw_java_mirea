package n1;

public class ArrayQueue {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;

    public void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        return elements[head];
    }

    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object removed = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        size = 0;
        head = 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
        }
    }
}
