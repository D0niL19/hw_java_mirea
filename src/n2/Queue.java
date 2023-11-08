package n2;

public interface Queue<E> {
    void enqueue(E element);
    E dequeue();

    E element();

    boolean isEmpty();

    int size();

    void clear();
}
