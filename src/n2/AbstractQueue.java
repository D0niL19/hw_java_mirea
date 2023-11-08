package n2;

public abstract class AbstractQueue<E> implements Queue<E> {
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}
