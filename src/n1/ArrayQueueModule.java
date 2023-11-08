package n1;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int head = 0;

    public static void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    public static Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        return elements[head];
    }

    public static Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object removed = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return removed;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        size = 0;
        head = 0;
    }

    private static void ensureCapacity(int minCapacity) {
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
